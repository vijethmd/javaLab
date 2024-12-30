import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int num_pages;

    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    public int getNumPages() {
        return num_pages;
    }

    @Override
    public String toString() {
        return "Book{name='" + name + '\'' + ", author='" + author + '\'' + ", price=" + price + ", num_pages=" + num_pages + '}';
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Number of pages: ");
            int num_pages = scanner.nextInt();
            scanner.nextLine();
            books[i] = new Book(name, author, price, num_pages);
        }

        System.out.println("Details of books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
