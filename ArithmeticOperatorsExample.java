import java.util.Arrays;

class ArithmeticOperatorsExample {
    public static void main(String[] args) {

        double number = Double.parseDouble(args[0]);
        double sum = number, difference = number, product = number, quotient = number;

        args = Arrays.copyOfRange(args, 1, args.length);

        for(String arg: args) {
            sum += number;
            difference -= number;
            product *= number;
            quotient /= (number==0) ? 1 : number;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
    }
}
