package oops;
class BankAccount 
{
	// private data members to hide the data
	
	private long acc_no;
	private String name, email;
	private float amount;
	
	// public getter and setter methods
	
	public long getAcc_no() 
	{ 
		return acc_no; 
	}
	public void setAcc_no(long acc_no)
	{
		this.acc_no = acc_no;
	}
	public String getName() 
	{ 
		return name; 
	}
	public void setName(String name) 
	{ 
		this.name = name; 
	}
	public String getEmail() 
	{ 
		return email; 
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public float getAmount()
	{ 
		return amount; 
	}
	public void setAmount(float amount)
	{
		this.amount = amount;
	}
}
public class Encapsulation
{
	public static void main(String[] args)
	{
		// creating instance of Account class
		
		BankAccount acc = new BankAccount();
		
		// setting values through setter methods
		
		acc.setAcc_no(2310805450L);
		
		acc.setName("M Divya");
		
		acc.setEmail("divs689@gmail.com");
		
		acc.setAmount(140000f);
		
		// getting values through getter methods
		System.out.println(acc. getAcc_no()  + " " +   acc.getName() + " " +  acc.getEmail() + " " + acc.getAmount());
	}
}


