public class Employeewage
{
	public static void main(String[] args)
	{
	 int Is_full_time = 1;
	 int WagePerHr = 20;
	 int full_time = 8;
	 
	 double empcheck = Math.floor(Math.random()*10) % 2;

	 if (empcheck == Is_full_time){
	  		double totalwage = WagePerHr*full_time;
			System.out.println("Wage="+totalwage);
	 }
	 else
			System.out.println("Employee is Abscent");
	 

	}	
}

