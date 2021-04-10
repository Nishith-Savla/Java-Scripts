import java.util.Scanner;

class LeapYearCheckerUsingConditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        short year = scanner.nextShort();
        boolean isLeapYear = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0) ? true : false;
        if (isLeapYear) 
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }
}
