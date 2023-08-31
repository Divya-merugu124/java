package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Second_number {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 28, 2, 10, 1533, 13, 12234,1,345,90,9,3,97);

       List<Integer> sorted=numbers.stream()
    		   .sorted()
    		   .collect(Collectors.toList());
       int smallest=sorted.get(1);
       int largest=sorted.get(sorted.size()-2);
       System.out.println("List of numbers" +numbers);
       System.out.println("second smallest number" +smallest);
       System.out.println("second largest  number" +largest);
       	
    }
}