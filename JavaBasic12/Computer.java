package JavaBasic12;


public class Computer {
    private String name;
    private int price;
    private String color;
    private String isbn;

    public Computer(String name, int price, String color, String isbn) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }
}

