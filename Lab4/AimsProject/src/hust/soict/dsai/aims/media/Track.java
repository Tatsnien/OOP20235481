package hust.soict.dsai.aims.media;

public class Track implements Playable{
	
	private String title;
	private int length;
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;		
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		try {
			Track track = (Track) obj;
			return track.getTitle().equals(title) &&
					track.getLength() == length;
		}
		catch(Exception e) {
			return false;
		}
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
}
