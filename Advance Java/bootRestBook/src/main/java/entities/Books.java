package entities;

public class Books {

	private int Id;
	private String title;
	private String author;

	public Books(int id, String title, String author) {
		super();
		Id = id;
		this.title = title;
		this.author = author;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [Id=" + Id + ", title=" + title + ", author=" + author + "]";
	}

}
