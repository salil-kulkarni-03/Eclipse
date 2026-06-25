
public class TestLibrary {
	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		Book b2 = new Book("The Kite Runner");
		
		Member m1 = new Member("George");
		Member m2 = new Member("Martha");
		
		b1.status();
		m1.status();
		
		b1.issueBook(m1);

		b1.status();
		m1.status();

		b1.issueBook(m2);   // Not allowed

		b1.returnBook();

		b1.issueBook(m2);   // Allowed now

		b1.status();
		m2.status();
	}
}
