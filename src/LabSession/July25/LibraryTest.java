package LabSession.July25;

public class LibraryTest {
    public static void main(String[] args) {
    	
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "2415");
        Book book2 = new Book("Atomic Habits", "James Clear", "1292");

        // Display initial info
        book1.displayInfo();
        book2.displayInfo();

        
        book1.issueBook();
        book1.issueBook(); 		//Already issued

        book1.returnBook();
        book1.returnBook();     //Already available

        book2.issueBook();
        book2.displayInfo();
    }
}
