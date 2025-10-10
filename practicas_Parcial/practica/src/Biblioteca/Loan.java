package Biblioteca;
import java.util.Scanner;

public class Loan {
    private int id;
    private String loanDate;
    private User user;
    private Book book;


    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;

    }

    public Loan(int id, String loanDate, User user, Book book) {
        this.id = id;
        this.loanDate = loanDate;
        this.user = user;
        this.book = book;
    }

    public void showDetails() {
        System.out.println("Loan Details:");
        System.out.println("Loan ID: " + id);
        System.out.println("Loan Date: " + loanDate);
        System.out.println("User Name: " + user.getName());
        System.out.println("Book Title: " + book.getTitle());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter Loan ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        

        System.out.print("Enter User Name: ");
        User user = new User(0, scanner.nextLine());


        System.out.print("Enter Book Title: ");
        Book book = new Book("", "", "");
        book.setTitle(scanner.nextLine());

        System.out.print("Enter Loan Date (YYYY-MM-DD): ");
        String loanDate = scanner.nextLine();
        
        scanner.close();

        Loan loan = new Loan(id, loanDate, user, book);
        loan.showDetails();
    }

}