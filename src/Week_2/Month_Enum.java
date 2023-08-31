package Week_2;

public class Month_Enum 
{
	public enum Month
	{
		JANUARY(31),
		FEBUARY(28),
		MARCH(31),
		APRIL(30),
		MAY(31),
		JUNE(30),
		JULY(31),
		AUGUST(31),
		SEPTEMBER(30),
		OCTOBER(31),
		NOVEMBER(30),
		DECEMBER(31);
		 private final int days;
		 

		Month(int days) 
		{
			this.days=days;
			
		}
		public int getDays()
		{
			return days;
			
		}
		
	}
		
	public static void main(String[] args)
	{
		Month month =Month.JANUARY;
		Month month1=Month.NOVEMBER;
		int daysInMonth=month.getDays();
		System.out.println(month +" has " + daysInMonth +"days");
		System.out.println(month1 +" has " + daysInMonth +"days");
		

	}

}
