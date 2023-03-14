
public class Practice5_3 {
    public static void main(String[] args) {
//        email("불꽃남자", "rhkdejr31@gamil.com", "박태현");
        String address = "rhkdejr31@gmail.com";
        String title = "불꽃남자";
        String text = "박태현";
        email(address, text);
    }

    public static void email(String title, String address, String text) {
        System.out.printf("%s에 아래의 메일을 송신한다.\n제목 : %s \n본문 : %s", address, title, text);
    }
    
    public static void email(String address, String text) {
        email("제목 없음", address, text);
    }
}

