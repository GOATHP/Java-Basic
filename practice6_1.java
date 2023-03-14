public class practice6_1 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, j * i);

            }
            System.out.print("\n");
        }
    }
}
