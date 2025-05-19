package week1.day2.assignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library obj = new Library();
		System.out.println("Added Book "+ obj.addBook("Java"));
		obj.issueBook();
	}

}
