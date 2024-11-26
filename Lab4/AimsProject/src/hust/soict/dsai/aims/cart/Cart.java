package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() == 20) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsOrdered.add(media);
		
		System.out.println("The media has been added");
	}
	
	public void addMedia(Media[] mediaList) {
		int n = mediaList.length;
		
		if (itemsOrdered.size() + n > 20) {
			System.out.println("The cart is almost full");
			return;
		}
		
		for (int i = 0; i < n; ++i)
			itemsOrdered.add(mediaList[i]);
		
		System.out.println(n + " medias has been added");
	}
	
	public void addMedia(Media media1, Media media2) {
		if (itemsOrdered.size() >= 19) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsOrdered.add(media2);
		itemsOrdered.add(media2);
		
		System.out.println("2 medias has been added");
	}
	
	public void removeMedia(Media media) {
		for (Media item : itemsOrdered)
			if (item.equals(media)) {
				itemsOrdered.remove(media);
				System.out.println("The media has been removed");
				return;
			}
		System.out.println("Media not found");
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
		
		for (int i = 0; i < itemsOrdered.size(); ++i) 
			System.out.println(i + 1 + ". " + itemsOrdered.get(i).toString());
		
		System.out.println("Total cost: " + totalCost() + " $");
		System.out.println("**************************************************");
	}

	public void search(int id) {
		int cnt = 0;
		for (int i = 0; i < itemsOrdered.size(); ++i)
			if (itemsOrdered.get(i).isMatch(id)) {
				cnt += 1;
				System.out.println(cnt + ". " + itemsOrdered.get(i).toString());
			}
		if (cnt == 0)
			System.out.println("No result found!");
	}
	
	public void search(String title) {
		int cnt = 0;
		for (int i = 0; i < itemsOrdered.size(); ++i)
			if (itemsOrdered.get(i).isMatch(title)) {
				cnt += 1;
				System.out.println(cnt + ". " + itemsOrdered.get(i).toString());
			}
		if (cnt == 0)
			System.out.println("No result found!");
	}
}
