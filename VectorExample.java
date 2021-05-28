import java.util.Vector;
import java.util.Arrays;

public class VectorExample {
    public static void main (String[] args) {
        Vector<Integer> numbersVector = new Vector<>(
                Arrays.asList(new Integer[]{13, 45, 67, 10, 23, 34, 78}));

        System.out.println("Initial vector: " + numbersVector);
        System.out.println("Initial size of vector: " + numbersVector.size());

        numbersVector.remove(2);
        numbersVector.remove(3);

        numbersVector.add(64);

        System.out.println("Size of vector after modification: " + numbersVector.size());

        Object[] numbersObjArray = numbersVector.toArray();

        Integer[] numbers = Arrays.copyOf(numbersObjArray, numbersObjArray.length, Integer[].class);

        System.out.print("Array copied from vector: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
