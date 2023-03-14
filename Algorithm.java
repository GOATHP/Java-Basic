import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(evenOrOdd(input));
    }

    public static String evenOrOdd(String input) {
        String[] str = input.split(" ");
        int[] num = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        
        if (num[0] % 2 != num[1] % 2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
