import java.util.Scanner;

class CenteredReverseTrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        short row, number, space, lines = Short.parseShort(scanner.nextLine());

        for(row=lines; row > 0; --row) {
            for(space=0; space < lines-row; ++space) {
                System.out.print(' ');
            }
            for(number=1; number <= row; ++number) {
                System.out.print(number + " ");
            }
            //for(space=0; space < lines-row; ++space) {
                //System.out.println(' ');
            //}
            System.out.println();
        }
    }
}
