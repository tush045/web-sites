import java.util.*;
class library {
    private String bookNumber;
    private String bookName;
    private String author;
    private String publisher;
    private double price;
    private int totalCopies;
    private int copiesIssued;

    public library(String bookNumber, String bookName, String author, String publisher, double price, int totalCopies) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.totalCopies = totalCopies;
        this.copiesIssued = 0;
    }

    public boolean issueBook() {
        if (copiesIssued < totalCopies) {
            copiesIssued++;
            System.out.println("Book '" + bookName + "' issued successfully.");
            return true;
        } else {
            System.out.println("Sorry, all copies of '" + bookName + "' are already issued.");
            return false;
        }
    }
    public boolean returnBook() {
        if (copiesIssued > 0) {
            copiesIssued--;
            System.out.println("Book '" + bookName + "' returned successfully.");
            return true;
        } else {
            System.out.println("There are no issued copies of '" + bookName + "'.");
            return false;
        }
    }
    public void displayInfo() {
        System.out.println("Book Number: " + bookNumber);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Total Copies: " + totalCopies);
        System.out.println("Copies Issued: " + copiesIssued);
    }

    public static void main(String[] args) {
        library book1 = new library("B001", "Book One", "Author One", "Publisher A", 25.99, 5);
        book1.issueBook();
        book1.displayInfo();

        library book2 = new library("B002", "Book Two", "Author Two", "Publisher B", 19.99, 3);
        book2.issueBook();
        book2.displayInfo();
        book1.returnBook();
        book1.displayInfo();
        book2.returnBook();
        book2.displayInfo();
    }
}

