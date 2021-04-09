import java.util.Scanner;

class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println(number + " is " + (number%2==0 ? "EVEN" : "ODD"));
    }
}
