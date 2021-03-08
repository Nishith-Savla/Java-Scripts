import java.util.Arrays;
import java.lang.Integer;

public class Geekonacci {
    public static void main(String[] args) {
        if (args.length > 4) {
            args = Arrays.copyOfRange(args, 1, args.length);
        }

        // int[] arr = new int[N];
        int[] elements = Arrays.asList(Arrays.copyOfRange(args, 0, args.length - 1)).stream()
                .mapToInt(Integer::parseInt).toArray();
        int N = elements[elements.length - 1];

        for (int i = 3; i < N; ++i) {
            elements[i] = elements[i - 1] + elements[i - 2] + elements[i - 3];
            System.out.println("DEBUG: " + elements[i]);
        }
        System.out.println(elements[N - 1]);

    }
}