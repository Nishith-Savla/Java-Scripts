import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        // Creating one dimension array
        int[] array = new int[5];

        // Scanning inputs from user
        System.out.println("Enter " + array.length + " elements:");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Sorting array
        int temp;
        for(int i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - 1 - i; ++j) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        // print array
        System.out.println();
        System.out.print("Sorted elements: ");
        for(int element : array) {
            System.out.print(element + " ");
        }
    }
}
