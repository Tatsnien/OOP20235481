package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title){
		super(title);
	}
	
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("Author \"" + authorName + "\" has already existed!");
			return;
		}
		authors.add(authorName);
		System.out.println("Author \"" + authorName + "\" added!");
	}
	
	public void removeAuthor(String authorName) {
		for (String author : authors) 
			if (author.equals(authorName)) {
				authors.remove(author);
				System.out.println("Author \"" + authorName + "\" removed!");
				return;
			}
		System.out.println("Author \"" + authorName + "\" not found!");
	}
	
}
