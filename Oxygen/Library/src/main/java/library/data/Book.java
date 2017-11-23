package library.data;


/**
 * @author bolszowski
 *
 */
public class Book extends Publication{
	private static final long serialVersionUID = -59370862141666097L;
	private String author;
	private int pages;
	private String isbn;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Book(String title, String author, int year, int pages, String publisher, String isbn) {
		super(year, title, publisher);
		setAuthor(author);
		setPages(pages);
		setIsbn(isbn);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(32);
		builder.append("Title ");
		builder.append(getTitle());
		builder.append(" author: ");
		builder.append(getAuthor());
		builder.append(" year: ");
		builder.append(getYear());
		builder.append(" amount of pages: ");
		builder.append(getPages());
		builder.append(" from publisher: ");
		builder.append(getPublisher());
		builder.append(" ISBN: ");
		builder.append(getIsbn());
	
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + pages;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}
	

}
