
public class Practice5_1 {
    public static void introduceOneself() {
        String name = "박태현";
        int age = 28;
        double height = 176;
        String gender = "불꽃남자";
               
        System.out.printf("안녕하세요 저는 %d살 %s %s입니다.키는 %.1f입니다. 잘 지내봐요", age, gender, name, height);
    }


    public static void main(String[] args) {
        introduceOneself();
    }
}