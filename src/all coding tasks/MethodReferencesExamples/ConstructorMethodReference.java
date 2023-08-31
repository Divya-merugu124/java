//Constructor method reference
package MethodReferencesExamples;
import java.util.function.Supplier;

class Person 
{
	    private String name;

	    public Person() 
	    {
	        this.name = "Unknown";
	    }

	    public Person(String name)
	    {
	        this.name = name;
	    }

	    public String getName()
	    {
	        return name;
	    }
	}

	public class ConstructorMethodReference {
	    public static void main(String[] args) {
	        // Using a constructor method reference to create new instances
	        Supplier<Person> personSupplier = Person::new;

	        // Creating new Person instances using the constructor reference
	        Person person1 = personSupplier.get();
	        Person person2 = personSupplier.get();

	        System.out.println(person1.getName());
	        System.out.println(person2.getName());
	    }
	}


