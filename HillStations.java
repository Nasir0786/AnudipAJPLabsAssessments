package Anudip.LabAsses;

public class HillStations
{	
	public void location()
	{
		System.out.println("Located at....");
	}
	
	public void famous()
	{
		System.out.println("This place is famous for...");
	}
	
	class Manali extends HillStations 
	{
		public void location()
		{
			System.out.println("Located at Manali....");
		}
		
		public void famous()
		{
			System.out.println("This place is famous for Snow...");
		}
	}
	
	class Mussorie extends HillStations 
	{
		public void location()
		{
			System.out.println("Located at Mussorie....");
		}
		
		public void famous()
		{
			System.out.println("This place is famous for Rivers");
		}
	}	
	
	class Gulmarg extends HillStations 
	{
		public void location()
		{
			System.out.println("Located at Gulmarg....");
		}
		
		public void famous()
		{
			System.out.println("This place is famous for Its Nature...");
		}
	}

	public static void main(String[] args)
	{
		HillStations Hills = new HillStations();
		Manali Man = Hills.new Manali();
		Mussorie Muss = Hills.new Mussorie();
		Gulmarg Gul = Hills.new Gulmarg();
		
		Man.location();
		Man.famous();
		
		System.out.println();
		
		Muss.location();
		Muss.famous();
		
		System.out.println();
		
		Gul.location();
		Gul.famous();
		
		

	}

}
