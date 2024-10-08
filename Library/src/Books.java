/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Books {
	
	//Properties: Title, Author, ISBN, Genre, Availability
	//Methods: Getters and setters for properties
	
	public String Title;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Books(String title, String author, int iSBN, String genre, int availability) {
		super();
		Title = title;
		Author = author;
		ISBN = iSBN;
		Genre = genre;
		Availability = availability;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public int getAvailability() {
		return Availability;
	}
	public void setAvailability(int availability) {
		Availability = availability;
	}
	public String Author;
	public int ISBN;
	public String Genre;
	public int Availability;
	

}
