import java.util.Scanner;
import java.lang.Math;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Number should be positive & greater than zero");
            System.exit(1);
        } 
        if (num == 1) {
            System.out.println("Neither prime nor composite" );
            return;
        }
        boolean isNotPrime = false;
        for (int i = 2; i < Math.sqrt(num); ++i) {
            if(num % i == 0) {
                System.out.println(num + " is NOT a Prime number (is divisible by " + i + ")");
                isNotPrime = true;
                break;
            }
        }
        if(!isNotPrime) // If number is prime
            System.out.println(num + " is a Prime number");
    }
}
