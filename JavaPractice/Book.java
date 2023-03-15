package JavaPractice;

public class Book extends TangibleAsset{
    private String isbn;
    
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    
}

    @Override
    public String getIsbn() {
        // TODO Auto-generated method stub
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getMakerName() {
        // TODO Auto-generated method stub
        return null;
    }
}