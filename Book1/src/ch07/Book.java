package ch07;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {};
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
}
