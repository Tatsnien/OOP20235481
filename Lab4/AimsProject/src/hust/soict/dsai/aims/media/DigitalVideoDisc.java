package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
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
	
	public boolean isMatch(int id) {
		return getId() == id;
	}
	
	public boolean isMatch(String title) {
		String s1 = title.toLowerCase();
		String s2 = getTitle().toLowerCase();
		for (int i = 0; i < s1.length(); ++i)
			for (int j = 0; j < s2.length(); ++j)
				if (s1.charAt(i) == s2.charAt(j))
					return true;
		return false;
	}
}
