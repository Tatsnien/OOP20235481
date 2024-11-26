package hust.soict.dsai.aims.media;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isMatch(int id) {
		return getId() == id;
	}
	
	public boolean isMatch(String title) {
		String s1 = title.toLowerCase();
		String s2 = getTitle().toLowerCase();
		for (int i = 0; i < s1.length(); ++i)
			for (int j = 0; j < s2.length(); ++j)
				if (s1.charAt(i) == s2.charAt(j))
					return true;
		return false;
	}

}
