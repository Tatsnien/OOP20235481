package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Store {
	public static final int MAX_NUMBERS_IN_STORE = 100000;
	private List<Media> itemsInStore = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsInStore.size() == 20) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsInStore.add(media);
		System.out.println("The media has been added");
	}
	
	public void addMedia(Media[] mediaList) {
		int n = mediaList.length;
		
		if (itemsInStore.size() + n > 20) {
			System.out.println("The cart is almost full");
			return;
		}
		
		for (Media media : mediaList)
			itemsInStore.add(media);
		
		System.out.println(n + " medias has been added");
	}
	
	public void addMedia(Media media1, Media media2) {
		if (itemsInStore.size() >= 19) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsInStore.add(media1);
		itemsInStore.add(media2);
		
		System.out.println("2 medias has been added");
	}
	
	public void removeMedia(Media media) {
		for (Media item : itemsInStore)
			if (item.equals(media)) {
				itemsInStore.remove(media);
				System.out.println("The media has been removed");
				return;
			}
		System.out.println("Media not found");
	}
}
