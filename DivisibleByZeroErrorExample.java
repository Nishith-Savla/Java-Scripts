import java.util.Scanner;

public class DivisibleByZeroErrorExample {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second number: ");
        b = Integer.parseInt(scanner.nextLine());
        try {
            int result = a / b;
            System.out.println(a + " / " + b + " is " + result);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
