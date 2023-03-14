import java.util.Arrays;
import java.util.Scanner;

public class javaQuiz {
    public static void main(String[] args) {
        System.out.println("1부터 9까지의 숫자를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        
        int myPick = scanner.nextInt();
                
        String[] answer = new String[myPick+1];
        answer[0] = "Hello ";

        for (int i = 1; i < myPick+1; i++) {
            if (i == myPick) {
                answer[i] = scanner.next() + ".";
            } else {
                answer[i] = scanner.next() + ", ";
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]); {
                
            }
        }
    }
}
