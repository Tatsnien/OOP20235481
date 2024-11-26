package hust.soict.dsai.aims.media;

public class Disc extends Media {
	
	private int length;
	private String director;
	
	public Disc() {
	}
	
	public Disc(String director) {
		this.director = director;
	}

	public Disc(int length, String director) {
		this.length = length;
		this.director = director;		
	}

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	
}
