package JavaPractice;

public class main {
    
    public static void main(String[] args) {
        TangibleAsset tangibleAsset = null;
        
        tangibleAsset = new Computer("피파되는 컴퓨터", 500000, "회색", "Grey");
        
        System.out.println(tangibleAsset.getColor());
        
        tangibleAsset.setWeight(500);
        
        System.out.println(tangibleAsset.getWeight());
    }
}
