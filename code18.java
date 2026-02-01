class Book {
    private String title;
    private boolean isAvailable = true;

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Borrow book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    // Return book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned the book: " + title);
        } else {
            System.out.println("The book was not borrowed.");
        }
    }

    // Check availability
    public boolean isAvailable() {
        return isAvailable;
    }
}

public class code18 {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setTitle("Effective Java");

        b1.borrowBook();   // borrow
        b1.borrowBook();   // already borrowed

        b1.returnBook();   // return
        b1.returnBook();   // already returned

        System.out.println("Is book available? " + b1.isAvailable());
    }
}

