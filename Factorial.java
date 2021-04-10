import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int number = scanner.nextInt();
        long factorial = 1;
        if (number < 0) {
            System.out.println("Number should be positive");
            System.exit(1);
        }
        if (number <= 1) {
            System.out.println("Factorial of " + number + " is " + factorial);
            return;
        }
        for (int i = 2; i <= number; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
