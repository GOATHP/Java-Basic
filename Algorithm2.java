import java.util.Scanner;

public class Algorithm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(arithmeticSequence(input));
        
    }

    public static String arithmeticSequence(String input) {
        String answer = "";
        int[] lengths = new int[10];
        String[] str = input.split(" ");
        int[] num = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < 10; i++) {
            lengths[i] = (num[0] + num[1] * i);
        }
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                answer += lengths[i] + " ";
            } else {
                answer += lengths[i] + "\n";
            }
        }
        return answer;
    }
}


