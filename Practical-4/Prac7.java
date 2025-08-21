public class Prac7 {
    public static void main(String[] args) {
        Book book1 = new Book("The Three-Body Problem", "Liu Cixin", 499.99);
        System.out.println("\nBook Details:");
        book1.displayInfo();
        book1.applyDiscount(10);
        System.out.println("\nAfter 10% discount:");
        book1.displayInfo();
    }
}

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " INR");
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}