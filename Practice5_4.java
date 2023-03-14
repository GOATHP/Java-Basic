public class Practice5_4 {
    public static double calcTriangleArea(double bottom, double height) {
        double triangleArea = (bottom * height) / 2;
        return triangleArea; 
    }

    public static double calcCircleArea(double radius) {
        double circleArea = (radius * radius) * 3.14;
        return circleArea;
    }

    public static void main(String[] args) {
        System.out.printf("삼각형의 넓이는 %.1f cm^2입니다.\n",calcTriangleArea(2, 2));
        
        System.out.printf("원의 넓이는 %.1f cm^2입니다. 또는 %.1fπ입니다.",calcCircleArea(2),(calcCircleArea(2)/3.14));


    }
}
