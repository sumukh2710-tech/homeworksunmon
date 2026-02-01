class Product {
    private double price;
    private int stock;

    // Setter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be positive.");
        }
    }

    // Setter for stock with validation
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock! Stock cannot be negative.");
        }
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}

public class code17 {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setPrice(999.99);   // valid
        p1.setStock(50);       // valid

        p1.setPrice(-200);     // invalid
        p1.setStock(-10);      // invalid

        System.out.println("Product Price: ₹" + p1.getPrice());
        System.out.println("Available Stock: " + p1.getStock());
    }
}
