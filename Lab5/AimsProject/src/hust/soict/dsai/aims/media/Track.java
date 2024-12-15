package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

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
	
	public void play() throws PlayerException{
		if (this.getLength() > 0) {
			System.out.println("Playing track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());			
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}	
	
}
