package aimsproject;

public class DigitalVideoDisc {
	private String category;
	private String director;
	private int length;
	private float cost;
	private String title;
	
	DigitalVideoDisc(String title){
		super();
		this.title = title;
	}
	
	DigitalVideoDisc(String title, String category, float cost){
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	
	DigitalVideoDisc(String title, String category, String director, float cost){
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.title = title;
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
}
