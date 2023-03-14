
public class Practice4_2 {
    public static void main(String[] args) {

        hello("오준석");
        hello("박경덕");

        int x = 10;
        int y = 20;
        int result = add_1(x, y);
        System.out.println(x + "+" + y + "=" + result);
        int[] array = {1, 2, 3};
        printArray(array);
    }

    private static void printArray(int[] array) {
        // TODO Auto-generated method stub
        
    }

    public static void add(int x, int y) {
        int result = x + y;
        System.out.println(x + "+" + y + "=" + result);
    }

    public static int add_1(int x, int y) {
        int result = x + y;
        return (result);
    }

    public static double add_1(double x, double y) {
        double result = x + y;
        return (result);
    }

    public static void hello(String name) {
        System.out.println(name + "님 안녕하세염");
    }

}

