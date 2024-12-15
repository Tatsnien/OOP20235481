package hust.soict.dsai.aims.media;
import java.util.*;

import hust.soict.dsai.aims.exception.PlayerException;

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
	
	public CompactDisc(String title, String artist, String category, String cost) {
		super(title.strip(), category.strip(), Float.parseFloat(cost.strip()));
		this.artist = artist.strip();
	}

	public String getArtist() {
		return artist;
	}

	public List<Track> getTracks() {
		return tracks;
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
	
	@Override
	public int getLength() {
		int total_length = 0;
		for (Track track : tracks)
			total_length += track.getLength();
		return total_length;
	}
	
	@Override
	public String toString() {
		String res = "CD - ";
		res += getTitle() + " - ";
		res += getCategory() + " - ";
		res += getArtist() + " - ";
		
		for (int i = 0; i < tracks.size(); ++i) {
			res += tracks.get(i).getTitle();
			if (i + 1 < tracks.size())
				res += ", ";
		}
		res += " - ";
		
		res += getLength() + ": ";
		res += getCost() + " $";
		return res;
	}
	
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				}
				catch (PlayerException e) {
					throw e;
				}
			}
		}
		else
			throw new PlayerException("ERROR: CD length is non-positive!");
	}

}
