package Week_2;

import java.util.LinkedList;

public class linked_list {

	public static void main(String[] args)
	{
		//Creating a linked list to store names
		
		LinkedList<String> name =new LinkedList<>();
		
		//adding names to the list
		name.add("Ganga");
		name.add("Yamuna");
		name.add("Narmada");
		
		//printing names in reverse order
		System.out.println("Reverse Order:");
		for(int i =name.size()-1;i>=0;i--) 
		{
			System.out.println(name.get(i));
		}
		
		

	}

}
