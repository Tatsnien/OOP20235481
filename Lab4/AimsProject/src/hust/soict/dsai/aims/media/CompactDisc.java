package hust.soict.dsai.aims.media;
import java.util.*;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String artist){
		super(title);
		this.artist = artist;
	}
	
	public CompactDisc(String title, String artist, String category, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("Track \"" + track.getTitle() + "\" has already existed!");
			return;
		}
		tracks.add(track);
		System.out.println("Track \"" + track.getTitle() + "\" added!");
	}
	
	public void removeTrack(Track track) {
		for (Track cur : tracks) 
			if (cur == track) {
				tracks.remove(cur);
				System.out.println("Track \"" + track.getTitle() + "\" removed!");
				return;
			}
		System.out.println("Track \"" + track.getTitle() + "\" not found!");
	}
	
	public int getLength() {
		int total_length = 0;
		for (Track track : tracks)
			total_length += track.getLength();
		return total_length;
	}
	
	public void play() {
		for (Track track : tracks)
			track.play();
	}

}
