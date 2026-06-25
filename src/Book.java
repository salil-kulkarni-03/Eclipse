
public class Book {
	private String title;
	private Member mbr;
	
	public Book(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [Title: " + title + " ]";
	}

	public void status() {
		if(mbr == null) {
			System.out.println(title + " not issued to any member");
		}else {
			System.out.println(title + " issued to " + mbr);
		}
	}
	
	public boolean issueBook(Member member) {
	    if (mbr != null) {
	        System.out.println(title + " is already issued.");
	        return false;
	    }

	    if (member.getBook() != null) {
	        System.out.println(member + " already has a book.");
	        return false;
	    }

	    mbr = member;
	    member.setBook(this);
	    return true;
	}

	public void returnBook() {
	    if (mbr == null) {
	        System.out.println(title + " is not issued.");
	        return;
	    }

	    mbr.setBook(null);
	    mbr = null;
	}
	
	
}
