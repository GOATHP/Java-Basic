
public class Practice5_2 {
    public static void main(String[] args) {
        
        email("불꽃남자", "rhkdejr31@gamil.com", "박태현");
    }


    public static void email(String title, String address, String text) {
        System.out.printf("%s에 아래의 메일을 송신한다.\n제목 : %s \n본문 : %s", address, title, text);
    }
}
