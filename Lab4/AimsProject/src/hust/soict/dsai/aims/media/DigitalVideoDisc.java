package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private static int nbDigitalVideoDisc = 0;
	
	public DigitalVideoDisc(String title){
		super();
		setTitle(title);
		nbDigitalVideoDisc += 1;
		setId(nbDigitalVideoDisc);
	}
	
	public DigitalVideoDisc(String title, String category, float cost){
		super();
		setCategory(category);
		setTitle(title);
		setCost(cost);
		nbDigitalVideoDisc += 1;
		setId(nbDigitalVideoDisc);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost){
		super(director);
		setCategory(category);
		setTitle(title);
		setCost(cost);
		nbDigitalVideoDisc += 1;
		setId(nbDigitalVideoDisc);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(length, director);
		setCategory(category);
		setTitle(title);
		setCost(cost);
		nbDigitalVideoDisc += 1;
		setId(nbDigitalVideoDisc);
	}
	
	public String toString() {
		String res = "DVD - ";
		res += getTitle() + " - ";
		res += getCategory() + " - ";
		res += getDirector() + " - ";
		res += getLength() + ": ";
		res += getCost() + " $";
		return res;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
