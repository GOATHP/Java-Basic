package JavaApply3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import JavaApply.Person;

public class main {

    public static void main(String[] args) {
//        Book firstBook = new Book();
//        Book secondBook = new Book();
//        
//        
//        firstBook.setTitle("총균쇠");
//        firstBook.setPublishDate(new Date(2023, 3, 16));
//        
//        
//        secondBook.setTitle("총균쇠");
//        secondBook.setPublishDate(new Date(2023, 3, 16));
//        
//        System.out.println(firstBook.equals(secondBook));
//        System.out.println(secondBook.equals(firstBook));
//
//        Book bookFirst = new Book();
//        Book bookSecond = new Book();
//        
//        bookFirst.setTitle("총균쇠_3월판");
//        bookFirst.setPublishDate(new Date(2023, 3, 16));
//        
//        
//        bookSecond.setTitle("총균쇠_2월판");
//        bookSecond.setPublishDate(new Date(2023, 2, 16));
//        
//        ArrayList<Book> list = new ArrayList<>();
//        
//        list.add(bookFirst);
//        list.add(bookSecond);
//        
//        Collections.sort(list);
//        
//        
//        for (Book paper : list) {
//            System.out.println(paper.getTitle());
//        }
    Book firstBook = new Book();
    
    firstBook.setTitle("총균쇠");
    firstBook.setPublishDate(new Date(2023, 3, 16));
    

    Book secondBook = firstBook.clone();
    System.out.println(firstBook.equals(secondBook));
    }
}
