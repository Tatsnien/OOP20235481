package hust.soict.dsai.aims.media;

public class Disc extends Media {
	
	private int length;
	private String director;

	public Disc() {
		super();
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	
}
