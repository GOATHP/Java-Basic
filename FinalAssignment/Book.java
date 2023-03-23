package FinalAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private String borrower;
    private String bookName;
    private boolean avaliable;
    private String author;
    private String publisher;
    private int publicationYear;
    private String isbn;

    CSVReader csvReader = new CSVReader();
    ArrayList<String[]> dataRows = csvReader.getDataRows();

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.avaliable = true;

    }

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        ArrayList<String[]> dataRows = csvReader.getDataRows();
        
//        for (String[] dataRow : dataRows) {
//            System.out.println(dataRow.length);
//        }
    }
}


