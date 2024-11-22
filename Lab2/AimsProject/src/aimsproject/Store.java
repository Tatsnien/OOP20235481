package aimsproject;

public class Store {
	public static final int MAX_NUMBERS_IN_STORE = 100000;
	private DigitalVideoDisc itemsInStore[] = 
			new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
	private int qtyInStore;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyInStore == 20) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsInStore[qtyInStore] = disc;
		qtyInStore += 1;
		
		System.out.println("The disc has been added");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int n = dvdList.length;
		
		if (qtyInStore + n > 20) {
			System.out.println("The cart is almost full");
			return;
		}
		
		for (int i = 0; i < n; ++i, ++qtyInStore)
			itemsInStore[qtyInStore] = dvdList[i];
		
		System.out.println(n + " discs has been added");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyInStore >= 19) {
			System.out.println("The cart is almost full");
			return;
		}
		
		itemsInStore[qtyInStore] = dvd1;
		itemsInStore[qtyInStore + 1] = dvd2;
		qtyInStore += 2;
		
		System.out.println("2 discs has been added");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyInStore; ++i)
			if (itemsInStore[i] == disc) {
				for (int j = i; j < qtyInStore - 1; ++j)
					itemsInStore[i] = itemsInStore[i + 1];
				
				System.out.println("The disc has been removed");
				return;
			}
	}
}
