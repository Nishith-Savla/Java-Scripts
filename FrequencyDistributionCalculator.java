import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FrequencyDistributionCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 25;
        Integer[] numbers = new Integer[size];
        System.out.print("Enter any 25 numbers: ");
        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        List<Integer> numbersList = Arrays.asList(numbers);
        int min = numbersList.get(0);
        int max = numbersList.get(24);
        double median;
        if ((size & 1) == 1) { // checking if size is odd or even
            median = numbersList.get(size/2+1);
        } else {
            median = ( numbersList.get(size/2) + numbersList.get(size/2+1) ) / 2;
        }
        double mean = 0;
        List<Integer> modes = new ArrayList<>();
        Map<Integer, Integer> frequencies = new HashMap<>();
        // Calculate sum and fequencies in one loop
        for(int number : numbersList) {
            mean += number;
            frequencies.put(number, frequencies.getOrDefault(number, 0)+1);
        }
        mean /= size;
        // sorting by value
        frequencies = frequencies.entrySet().stream().sorted((value1, value2) -> value1.getValue().compareTo(value2.getValue())).collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1, LinkedHashMap::new));
        Integer[] values = frequencies.values().toArray(new Integer[frequencies.values().size()]);

        int modeCount = values[values.length - 1];
        for(Integer key: frequencies.keySet()) {
            if (frequencies.get(key) == modeCount) {
                modes.add(key);
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode(s): " + modes);
    }
}
