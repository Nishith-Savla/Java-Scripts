import java.util.Scanner;

class GraceMarkCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks out of 100: ");
        float marks = scanner.nextFloat();
        if (marks >=  35 && marks < 40) marks = 40;
        System.out.println("Total marks after adding grace marks: " + marks);
    }
}
