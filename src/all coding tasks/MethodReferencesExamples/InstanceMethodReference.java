//instance ,method reference example
package MethodReferencesExamples;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InstanceMethodReference
{
	    public static void main(String[] args)
	    {
	        List<String> names = new ArrayList<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");

	        // Using an instance method reference to System.out.println
	        Consumer<String> printName = System.out::println;

	        // Printing each name using the instance method reference
	        names.forEach(printName);
	    }
	}


