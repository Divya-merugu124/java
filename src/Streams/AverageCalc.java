package Streams;
import java.util.Arrays;
import java.util.List;

public class AverageCalc {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 45, 21, 290, 25);

        double average = calculateAverage(numbers);
        System.out.println("Average : " + average);
    }

    public static double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
             // Default value if the list is empty
                .orElse(0.0); 
    }
}

