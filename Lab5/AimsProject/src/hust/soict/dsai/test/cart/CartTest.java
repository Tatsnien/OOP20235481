package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

public class CartTest {

	public static void main(String[] args) {
		//Create a new class
		Cart cart = new Cart();
		
		//Create new dvd objects and add them to the cart
		Media dvd1 = new DigitalVideoDisc(
						"The Lion King", 
						"Animation", 
						"Roger Allers", 
						87,
						19.95f);
		cart.addMedia(dvd1);
		
		Media dvd2 = new DigitalVideoDisc(
						"Star Wars", 
						"Science Fiction", 
						"George Lucas", 
						87,
						24.95f);
		cart.addMedia(dvd2);
		
		Media dvd3 = new DigitalVideoDisc(
						"Aladin", 
						"Animation", 
						18.99f);
		cart.addMedia(dvd3);
		
		//Test the print method
		cart.print();
		
		cart.search(2);
		cart.search("Aladin");
		cart.search("Zoo");
		
	}

}