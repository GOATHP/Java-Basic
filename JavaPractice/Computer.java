package JavaPractice;

public class Computer extends TangibleAsset {
    private String makerName;
    
    public Computer(String name, int price, String color,String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }
    
    @Override 
    public String getMakerName() {
        return makerName;
    }
    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
    @Override
    public String getIsbn() {
        return null;
    }
    
}
