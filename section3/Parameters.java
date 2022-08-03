public class Parameters {
    public static void main(String[] args) {
        measureRectangle(3, 5);
    }

    public static void measureRectangle(double length, double width){
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
