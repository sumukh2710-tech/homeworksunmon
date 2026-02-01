class Book {
    String title;
    String author;
    double price;

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
        System.out.println("----------------------");
    }
}

public class code7 {
    public static void main(String[] args) {

        // Book 1
        Book b1 = new Book();
        b1.title = "Clean Code";
        b1.author = "Robert C. Martin";
        b1.price = 550;

        // Book 2
        Book b2 = new Book();
        b2.title = "Effective Java";
        b2.author = "Joshua Bloch";
        b2.price = 650;

        // Book 3
        Book b3 = new Book();
        b3.title = "Java: The Complete Reference";
        b3.author = "Herbert Schildt";
        b3.price = 750;

        // Display all books
        b1.display();
        b2.display();
        b3.display();
    }
}
