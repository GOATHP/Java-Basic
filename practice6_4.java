import java.util.Random;
import java.util.Scanner;

public class practice6_4 {
    public static void main(String[] args) {
        System.out.println("던질 횟수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        long tries = scanner.nextLong();
        double hits = 0;
        Random random = new Random();

        for (int i = 0; i < tries; i++) {
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;
            if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(1, 2)) {
                hits += 1;
            }
        }
        double piEstimate = 4 * hits / tries;
        System.out.println(piEstimate);
    }
}

