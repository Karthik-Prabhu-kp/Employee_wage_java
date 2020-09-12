public class EmpSwitch
{
	public static void main(String[] args)
	{
	 int Is_full_time = 1;
	 int Is_part_time = 2;
	 int WagePerHr = 20;
	 int full_time = 16;
	 int part_time = 8;
	 int min = 0;
	 int max = 2;
	 
	 int empcheck = (int)(Math.floor(Math.random() * (max - min + 1) + min));

	 switch (empcheck){
	 case 1:
	  		int totalwage = WagePerHr*full_time;
			System.out.println("Wage="+totalwage);
	 		break;
	 case 2: 
        	int totalwage = WagePerHr*part_time;
            System.out.println("Wage="+totalwage);
	 		break;

	 default:
			System.out.println("Employee is Abscent");
	 		break;
		}
	}	
}
