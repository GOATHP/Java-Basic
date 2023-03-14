import java.util.Scanner;

public class Weekendhomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int R = scanner.nextInt();
        int N = scanner.nextInt();
        String answer = "";
        
        for (int i = 1; i < N + 1; i++) {
            
            int x_i = scanner.nextInt();
            int y_i = scanner.nextInt();
            if (Math.pow((a - x_i), 2) + Math.pow((b - y_i), 2) <= Math.pow(R, 2) ) {
                answer += "noisy"+"\n";
            } else {
                answer += "silnet"+"\n";;
            }
        }
        System.out.println(answer.trim());
    }
}


