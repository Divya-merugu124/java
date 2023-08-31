
//program to convert a list of strings to upper case or lower case using streams with explanation
package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseConverter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hey", "hai", "welcome", "to", "java");

        List<String> uppercaseWords = convertToUppercase(words);
        System.out.println("Uppercase: " + uppercaseWords);

        List<String> lowercaseWords = convertToLowercase(words);
        System.out.println("Lowercase: " + lowercaseWords);
    }

    public static List<String> convertToUppercase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> convertToLowercase(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}