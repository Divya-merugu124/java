//Static method reference example
package MethodReferencesExamples;
import java.util.Arrays;
public class StaticMethodReference 
{
	    public static void main(String[] args) 
	    {
	        String[] names = {"Alice", "Charlie", "Bob"};

	        // Using a static method reference to Arrays.sort()
	        Arrays.sort(names, StaticMethodReference::compareNames);

	        // Printing the sorted names
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }

	    // Static method for comparing names
	    public static int compareNames(String a, String b) 
	    {
	        return a.compareTo(b);
	    }
	}


