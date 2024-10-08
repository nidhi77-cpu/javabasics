/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Admin extends User {
	private boolean adminPrivileges;
	public Admin(String name, int id, String email, String password , boolean adminPrivileges) {
		super(name, id, email, password);
		this.adminPrivileges = adminPrivileges;
		// TODO Auto-generated constructor stub
	}
	  // Getter for admin privileges
    public boolean isAdmin() {
        return adminPrivileges;
    }
    
  public  void addbooktolibrary(Books Book , Library library)
  {
	  if(adminPrivileges)
	  {
		  library.AddBook(Book);
	  }
	  else
	  {
		  System.out.println("some issue in adding book");
	  }
  }
	
//	Properties: Admin privileges
//	Methods:
//	AddBookToLibrary(Book book): Add a book to the library (admin only).
//	RemoveBookFromLibrary(Book book): Remove a book from the library (admin only).
//	AddUser(User user): Add a new user (admin only).
//	RemoveUser(User user): Remove a user (admin only).
  public  void removebooklibrary(Books Book , Library library)
  {
	  if(adminPrivileges)
	  {
		  library.RemoveBook(Book);
	  }
	  else
	  {
		  System.out.println("some issue in removing the  book");
	  }
  }
  
  

}
