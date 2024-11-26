package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered += 1;
		
		System.out.println("The disc has been added");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int n = dvdList.length;
		
		if (qtyOrdered + n > 20) {
			System.out.println("The cart is almost full");
			return;
		}
		
		for (int i = 0; i < n; ++i, ++qtyOrdered)
			itemsOrdered[qtyOrdered] = dvdList[i];
		
		System.out.println(n + " discs has been added");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered >= 19) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsOrdered[qtyOrdered] = dvd1;
		itemsOrdered[qtyOrdered + 1] = dvd2;
		qtyOrdered += 2;
		
		System.out.println("2 discs has been added");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; ++i)
			if (itemsOrdered[i] == disc) {
				for (int j = i; j < qtyOrdered - 1; ++j)
					itemsOrdered[i] = itemsOrdered[i + 1];
				
				System.out.println("The disc has been removed");
				return;
			}
	}
	
	public float totalCost() {
		float total_cost = 0;
		for (int i = 0; i < qtyOrdered; ++i) 
			total_cost += itemsOrdered[i].getCost();
		return total_cost;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		
		for (int i = 0; i < qtyOrdered; ++i) 
			System.out.println(i + 1 + ". " + itemsOrdered[i].toString());
		
		System.out.println("Total cost: " + totalCost() + " $");
		System.out.println("**************************************************");
	}

	public void search(int id) {
		int cnt = 0;
		for (int i = 0; i < qtyOrdered; ++i)
			if (itemsOrdered[i].isMatch(id)) {
				cnt += 1;
				System.out.println(cnt + ". " + itemsOrdered[i].toString());
			}
		if (cnt == 0)
			System.out.println("No result found!");
	}
	
	public void search(String title) {
		int cnt = 0;
		for (int i = 0; i < qtyOrdered; ++i)
			if (itemsOrdered[i].isMatch(title)) {
				cnt += 1;
				System.out.println(cnt + ". " + itemsOrdered[i].toString());
			}
		if (cnt == 0)
			System.out.println("No result found!");
	}
}
