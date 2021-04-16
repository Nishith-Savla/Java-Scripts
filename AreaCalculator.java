import java.lang.Math;
import java.util.Scanner;

public class AreaCalculator {

    /**
     * Calculates area of rectange
     * @param length    Length of rectange
     * @param breadth   Breadth of rectange
     * @return          Area of rectange
     */
    public static double area(double length, double breadth) {
        return length * breadth;
    }

    /**
     * Calculates area of triangle
     * @param base      Base of triangle
     * @param height    Height of triangle
     * @return          Area of triangle
     */
    public static float area(float base, float height) {
        return (base * height) / 2;
    }

    /**
     * Calculates area of circle
     * @param radius    Radius of circle
     * @return          Area of circle
     */
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates area of square
     * @param side      Length of side of square
     * @return          Area of square
     */
    public static float area(float side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the shape for which area is to be calculated: ");
        String shape = scanner.nextLine().toLowerCase().trim();
        System.out.println();

        switch (shape) {
            case "square": 
                System.out.print("Enter the side of the square: ");
                float side = Math.abs(scanner.nextFloat());
                System.out.println("Area of square with side " + side + " is " + area(side));
                break;

            case "circle": 
                System.out.print("Enter the radius of the circle: ");
                double radius = Math.abs(scanner.nextDouble());
                System.out.println("Area of circle with radius " + radius + " is " + area(radius));
                break;

            case "triangle": 
                System.out.print("Enter the base and height of the triangle: ");
                float base = Math.abs(scanner.nextFloat());
                float height = Math.abs(scanner.nextFloat());
                System.out.println("Area of triangle with base " + base + " and height " + height + " is " + area(base, height));
                break;

            case "rectangle": 
                System.out.print("Enter the length and breadth of the rectangle: ");
                double length = Math.abs(scanner.nextDouble());
                double breadth = Math.abs(scanner.nextDouble());
                System.out.println("Area of rectange with length " + length + " and breadth " + breadth + " is " + area(length, breadth));
                break;

            default:
                System.out.println("Shape not recognized");
                System.out.println("Please try one of (square, circle, triangle, rectangle)");
                System.out.println();
                main(args);
        }
    }
}
