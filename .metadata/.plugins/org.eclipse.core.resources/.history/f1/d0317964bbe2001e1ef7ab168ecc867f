/**
 * 
 */
package java_oops;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * @author srinidhi.k
 *
 */
public class Librarymainclass {

	public static void main(String[] args) {

		// Create some initial books
		Book book1 = new Book("The Author of Some Zaffari", "Nidhi", "SWDEFF");
		Book book2 = new Book("Another Book", "Another Author", "ISBN123");

		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		List<Book> borrowedBooks = new ArrayList<>();
		borrowedBooks.add(book1);

		// Create a member with borrowed books
		Member member = new Member("Nidhi", 1, borrowedBooks);
		List<Member> members = new ArrayList<>();
		members.add(member);

		// Create the Library with initial books and members
		Library library = new Library(books, members);

		// Implement a simple console menu for users to interact with the library system
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Library Management System Menu:");
			System.out.println("1. Display available books");
			System.out.println("2. Display borrowed books for a member");
			System.out.println("3. Issue a book");
			System.out.println("4. Return a book");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				// Display available books
				library.displayAvailableBooks();
				break;

			case 2:
				// Display borrowed books for a member
				System.out.print("Enter member ID: ");
				int memberId = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character
				library.displayBorrowedBooks(memberId, member);
				break;

			case 3:
				// Issue a book
				System.out.print("Enter member ID: ");
				int borrowerId = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character

				System.out.print("Enter ISBN of the book to be issued: ");
				String isbnToIssue = scanner.nextLine();

				library.issueBook(borrowerId, isbnToIssue, member, book2);
				break;

			case 4:
				// Return a book
				System.out.print("Enter member ID: ");
				int returnerId = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character

				System.out.print("Enter ISBN of the book to be returned: ");
				String isbnToReturn = scanner.nextLine();

				library.returnBook(returnerId, isbnToReturn, book2);
				break;

			case 5:
				System.out.println("Exiting the Library Management System. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 5);

		scanner.close();
	}

}
