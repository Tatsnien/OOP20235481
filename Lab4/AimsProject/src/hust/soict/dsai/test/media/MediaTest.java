package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.*;

public class MediaTest {
	
	public static void CompactDiscTest() {
		CompactDisc disc = new CompactDisc("liebestraum", "fish");
		Track a = new Track("a", 1);
		Track b = new Track("b", 2);
		Track c = new Track("c", 3);
		
		System.out.println(disc.getArtist());
		
		disc.addTrack(a);
		disc.addTrack(b);
		disc.addTrack(c);
		disc.addTrack(c);
		disc.removeTrack(a);
		disc.removeTrack(a);
		
		System.out.println(disc.getLength());
		
		disc.play();
	}
	
	public static void BookTest() {
		Book book = new Book("data structures and algorithms");
		
		book.addAuthor("a");
		book.addAuthor("b");
		book.addAuthor("c");
		book.addAuthor("c");
		book.removeAuthor("a");
		book.removeAuthor("a");
	}
	
	public static void DVDTest() {
		DigitalVideoDisc dvd1 = 
				new DigitalVideoDisc(
						"The Lion King", 
						"Animation", 
						"Roger Allers", 
						87,
						19.95f);
		System.out.println("dvd1 = " + dvd1.getId());
		
		DigitalVideoDisc dvd2 = 
				new DigitalVideoDisc(
						"Star Wars", 
						"Science Fiction", 
						"George Lucas", 
						87,
						24.95f);
		System.out.println("dvd2 = " + dvd2.getId());
		
		DigitalVideoDisc dvd3 = 
				new DigitalVideoDisc(
						"Aladin", 
						"Animation", 
						18.99f);
		System.out.println("dvd3 = " + dvd3.getId());
	}

	public static void main(String[] args) {
		CompactDiscTest();
		BookTest();
		DVDTest();
	}

}
