package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String category;
	private String director;
	private int length;
	private float cost;
	private String title;
	private static int nbDigitalVideoDisc = 0;
	private static int id; 
	
	public DigitalVideoDisc(String title){
		super();
		this.title = title;
		nbDigitalVideoDisc += 1;
		id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, float cost){
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost){
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.title = title;
		nbDigitalVideoDisc += 1;
		id = nbDigitalVideoDisc;
	}

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		String res = "DVD - ";
		res += title + " - ";
		res += category + " - ";
		res += director + " - ";
		res += length + ": ";
		res += cost + " $";
		return res;
	}
	
	public boolean isMatch(int id) {
		return this.id == id;
	}
	
	public boolean isMatch(String title) {
		String s1 = title.toLowerCase();
		String s2 = this.title.toLowerCase();
		for (int i = 0; i < s1.length(); ++i)
			for (int j = 0; j < s2.length(); ++j)
				if (s1.charAt(i) == s2.charAt(j))
					return true;
		return false;
	}
}
