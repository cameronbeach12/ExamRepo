public class CircleAreaCalculator {
    public static void main(String[] args) {
        double radius = 5.0; // radius of the circle
        double area = Math.PI * sqrt(radius); // formula for area of a circle
        System.out.println("The area of the circle is " + area);
    }

    public static double sqrt(double input) {
        return input * input;
    }
}