import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Library {
	
	//Properties: List of books, List of users
//	Methods:
//	AddBook(Book book): Add a book to the library.
//	RemoveBook(Book book): Remove a book from the library.
//	RegisterUser(User user): Register a new user.

 public List<Books> book;
 public List<Books> getBook() {
	return book;
}
public void setBook(List<Books> book) {
	this.book = book;
}
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public List<User> users;
public Library(List<Books> book, List<User> users) {
	book = new ArrayList<>();
	users = new ArrayList<>();
}

public void AddBook(Books books)
{
	book.add(books);
	
}
public void RemoveBook(Books books)
{
	book.remove(books);
}

public void RegisterUser(User user)
{
	users.add(user);
}


/*
 * public List<Books> SearchBook(String keyword) { List<Books> searchlist = new
 * ArrayList<>();
 * 
 * for(Books books : book) { if(books.getTitle().equalsIgnoreCase(keyword)) {
 * searchlist.add(books); } } return ;
 * 
 * }
 */
//ReturnBook(User user, Book book): Process the return of a book.



}
