import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class LibrarySystem {
	
	 public static void main(String[] args) {
	        List<Books> library = new ArrayList<>();
	        List<User> users = new ArrayList<>();

	        // Create some books
	        Books book1 = new Books("Book 1", "Author 1", 10, "simple", 12);
	        Books book2 = new Books("Book 2", "Author 2", 88, "simple", 12);
	        library.add(book1);
	        library.add(book2);
	        System.out.println("the books in the library are"+library);
	        
	       // creating the user with respect to admin 
	        Admin ad = new Admin("srinidhi_kk", 77, "ksrinidhi63@gmail.com","Vidhya&8", false);
	       ad.addbooktolibrary(book2, null);
	       ad.removebooklibrary(book2, null);
	       
	       // creating the object of the library
	       
	       Library lib = new Library(library, users);
	       
	        
	}
}


