public class PartTimeEmpl
{
	public static void main(String[] args)
	{
	 int Is_full_time = 1;
	 int Is_part_time = 2;
	 int WagePerHr = 20;
	 int full_time = 16;
	 int part_time = 8;
	 
	 double empcheck = Math.floor(Math.random()*3) ;

	 if (empcheck == Is_full_time){
	  		double totalwage = WagePerHr*full_time;
			System.out.println("Wage="+totalwage);
	 }
	 else if (empcheck == Is_part_time){
        	double totalwage = WagePerHr*part_time;
            System.out.println("Wage="+totalwage);
	 }

	 else
			System.out.println("Employee is Abscent");
	 

	}	
}
