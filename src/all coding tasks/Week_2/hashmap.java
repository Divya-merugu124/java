package Week_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        Map<String,Integer>Grades = new HashMap<>();

        // Adding student names and grades to the HashMap
        Grades.put("A", 92);
        Grades.put("B", 82);
        Grades.put("C", 78);
        Grades.put("D", 91);
        Grades.put("E", 40);
        Grades.put("F", 55);
        Grades.put("G", 85);
        Grades.put("H", 79);
        Grades.put("I", 94);
        Grades.put("J", 90);
        

        // Print all student names and their grades
        System.out.println("Original HashMap:");
        for (Map.Entry<String, Integer> entry : Grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Find and remove the student with the lowest grade
        String lowestGradeStudent = null;
        int lowestGrade = Integer.MAX_VALUE;
        for (Entry<String, Integer> entry : Grades.entrySet()) {
            if (entry.getValue() < lowestGrade) {
                lowestGrade = entry.getValue();
                lowestGradeStudent = entry.getKey();
            }
        }
        
        if (lowestGradeStudent != null) {
            Grades.remove(lowestGradeStudent);
        }

        // Print the updated HashMap after removing the lowest grade student
        System.out.println("\nHashMap after removing the lowest grade student:");
        for (Entry<String, Integer> entry : Grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

	private static Entry<String, Integer>[] entrySet() {
		
		return null;
	}
}
