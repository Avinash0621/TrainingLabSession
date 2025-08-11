package LabSession.July25;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; 
    }

    // Issue the book
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued : " + title);
        } else {
            System.out.println("Cannot issue. Book already issued : " + title);
        }
    }

    // Return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned : " + title);
        } else {
            System.out.println("Book is already available : " + title);
        }
    }

    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }
}
