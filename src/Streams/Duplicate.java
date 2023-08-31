package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(14,1,3,4,1,2,3,4,5,5,5,6,7,7,8,9,8,8,12);
        System.out.println("original list " +numbers);

        List<Integer> Num = removeDuplicates(numbers);
        System.out.println("after removing duplicate values " + Num);
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
       
        
    }
}




