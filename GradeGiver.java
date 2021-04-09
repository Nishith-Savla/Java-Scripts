import java.util.Scanner;

class GradeGiver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        String grade;
        int marks = scanner.nextInt();
        if(marks >= 80) grade = "A+";
        else if(marks >= 75) grade = "A";
        else if(marks >= 60) grade = "B";
        else if(marks >= 45) grade = "C";
        else if(marks >= 35) grade = "D";
        else grade = "F";
        System.out.println("Your grade is " + grade);
    }
}
