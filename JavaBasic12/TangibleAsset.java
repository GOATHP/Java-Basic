package JavaBasic12;

public abstract class TangibleAsset {
    private int price;
    private String color;
    private String name;
    
    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
        
    }
}
