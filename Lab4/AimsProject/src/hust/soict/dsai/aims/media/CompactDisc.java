package hust.soict.dsai.aims.media;
import java.util.*;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("Track existed!");
			return;
		}
		tracks.add(track);
		System.out.println("Track added!");
	}
	
	public void removeTrack(String trackName) {
		for (int i = 0; i < tracks.size(); ++i) 
			if (tracks.get(i).getTitle().equals(trackName)) {
				tracks.remove(i);
				System.out.println("Track removed!");
				return;
			}
		System.out.println("Track not found!");
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
