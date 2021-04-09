import java.util.Scanner;

class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the operator: ");
        String operator = scanner.nextLine().strip();

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        double result;
        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
            case "÷":
                result = num1 / num2;
                break;
        }
    }
}
