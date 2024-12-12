package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = 
			FXCollections.observableArrayList();
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsOrdered.add(media);
		System.out.println("\"" + media.getTitle() + "\" has been added.");
	}
	
	public void addMedia(Media[] mediaList) {
		for (Media media : mediaList) 
			addMedia(media);
	}
	
	public void addMedia(Media media1, Media media2) {
		addMedia(media1);
		addMedia(media2);
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
	
	public float totalCost() {
		float total_cost = 0;
		for (Media media : itemsOrdered) 
			total_cost += media.getCost();
		return total_cost;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		
		int i = 0;
		for (Media media : itemsOrdered) {
			i += 1;
			System.out.println(i + ". " + media.toString());
		}
		
		System.out.println("Total cost: " + totalCost() + " $");
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
			if (media.isMatchByID(id)) {
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
