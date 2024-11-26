package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("Author existed!");
			return;
		}
		authors.add(authorName);
		System.out.println("Author added!");
	}
	
	public void removeAuthor(String authorName) {
		for (int i = 0; i < authors.size(); ++i) 
			if (authors.get(i).equals(authorName)) {
				authors.remove(i);
				System.out.println("Author removed!");
				return;
			}
		System.out.println("Author not found!");
	}
}
