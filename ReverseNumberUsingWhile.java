import java.util.Scanner;

class ReverseNumberUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int number = scanner.nextInt(), reverse = 0;
        System.out.print("Reverse of " + number + " is ");
        while(number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
