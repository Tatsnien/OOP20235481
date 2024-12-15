package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.math.*;
import java.util.*;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private DoubleProperty totalCost;
	private ObservableList<Media> itemsOrdered = 
			FXCollections.observableArrayList();
	
	public Cart(){
		totalCost = new SimpleDoubleProperty(0);
		itemsOrdered.addListener((ListChangeListener<? super Media>) c -> {calculateTotalCost();});
	}
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public double getTotalCost() {
		Double totalCost = BigDecimal.valueOf(this.totalCost.get())
			    .setScale(3, RoundingMode.HALF_UP)
			    .doubleValue();
		
		return totalCost;
	}
	
	public DoubleProperty totalCostProperty() {
		return totalCost;
	}

	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsOrdered.add(media);
		System.out.println("\"" + media.getTitle() + "\" has been added.");
		
		try {Platform.runLater(this::calculateTotalCost);} catch (Exception e) {}
	}
	
	public void addMedia(Media[] mediaList) {
		for (Media media : mediaList) 
			addMedia(media);
		try {Platform.runLater(this::calculateTotalCost);} catch (Exception e) {}
	}
	
	public void addMedia(Media media1, Media media2) {
		addMedia(media1);
		addMedia(media2);
		try {Platform.runLater(this::calculateTotalCost);} catch (Exception e) {}
	}
	
	public void removeMedia(Media media) {
		for (Media item : itemsOrdered)
			if (item.equals(media)) {
				itemsOrdered.remove(media);
				System.out.println("\"" + media.getTitle() + "\" has been removed.");
				return;
			}
		System.out.println("\"" + media.getTitle() + "\" is not found");
	}
	
	public void clear() {
		this.itemsOrdered.clear();
	}
	
	public void calculateTotalCost() {
		totalCost.set(itemsOrdered.stream().mapToDouble(Media::getCost).sum());
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		
		int i = 0;
		for (Media media : itemsOrdered) {
			i += 1;
			System.out.println(i + ". " + media.toString());
		}
		
		System.out.println("Total cost: " + getTotalCost() + " $");
		System.out.println("**************************************************");
	}

	public ObservableList<Media> searchById(String id) {
		ObservableList<Media> res = FXCollections.observableArrayList();
			
		if (id == "") {
			res.addAll(itemsOrdered);
			return res;
		}
		
		int cnt = 0;
		for (Media media : itemsOrdered)
			if (media.isMatchById(id)) {
				cnt += 1;
				System.out.println(cnt + ". " + media.toString());
				res.add(media);
			}
		if (cnt == 0)
			System.out.println("No result found!");
		
		return res;
	}
	
	public ObservableList<Media> searchByTitle(String title) {
		ObservableList<Media> res = FXCollections.observableArrayList();
		
		if (title == "") {
			res.addAll(itemsOrdered);
			return res;
		}
			
		int cnt = 0;
		for (Media media : itemsOrdered)
			if (media.isMatchByTitle(title)) {
				cnt += 1;
				System.out.println(cnt + ". " + media.toString());
				res.add(media);
			}
		if (cnt == 0)
			System.out.println("No result found!");
		
		return res;
	}
	
	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
	
}
