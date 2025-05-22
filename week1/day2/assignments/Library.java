package week1.day2.assignments;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library obj = new Library();
		System.out.println("Added Book "+ obj.addBook("Java"));
		obj.issueBook();
	}

	public String addBook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}
}
