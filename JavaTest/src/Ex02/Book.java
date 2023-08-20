package Ex02;

public class Book {
	String isbn, title, writer, content;
	int price;

	public Book () {}
	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	public String getIsbn() {return isbn;}
	public void setIsbn(String isbn) {this.isbn = isbn;}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}

	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}

	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	@Override
	public String toString() {
		return isbn + " | " + title + " | " + writer + " | " + content + " | "+ price;
	}
}
