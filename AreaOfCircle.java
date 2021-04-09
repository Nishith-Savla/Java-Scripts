import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        System.out.print("Enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double area = PI * radius * radius;
        System.out.println(area);
    }
}
