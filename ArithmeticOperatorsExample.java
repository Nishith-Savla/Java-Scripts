import java.util.Arrays;

class ArithmeticOperatorsExample {
    public static void main(String[] args) {

        double number = Double.parseDouble(args[0]);
        double sum = number, difference = number, product = number, quotient = number, remainder = number;

        args = Arrays.copyOfRange(args, 1, args.length);

        for(String arg: args) {
            number = Double.parseDouble(arg);
            sum += number;
            difference -= number;
            product *= number;
            quotient /= (number==0) ? 1 : number;
            remainder %= (number==0) ? remainder+1 : number;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder(Modulus) is: " + remainder);
    }
}
