package FinalPracticeSleepy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<Book>();
        members = new ArrayList<Member>();
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Enter publication date (yyyy-mm-dd): ");
        LocalDate publicationDate = LocalDate.parse(scanner.nextLine());
        Book book = new Book(isbn, title, author, publisher, publicationDate);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void addMember() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Join Date: ");
        String joinDate = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        System.out.println("Enter birthdate (yyyy-mm-dd): ");
        String birthDay = scanner.nextLine();
        Member member = new Member(joinDate, name, address, contactNumber, birthDay);
        members.add(member);
        System.out.println("Member added successfully!");
    }
}
