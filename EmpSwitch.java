public class EmpSwitch
{
	public static void main(String[] args)
	{
	 int WagePerHr = 20;
	 
	 int empcheck = (int)(Math.floor(Math.random()*3));

	 switch (empcheck){
	 case 1:
			int full_time=16;
	  		int dailywage = WagePerHr*full_time;
			System.out.println(dailywage);
	 		break;
	 case 2: 
			int parttime=8;
        	int totalwage = WagePerHr*parttime;
            System.out.println(totalwage);
	 		break;

	 default:
			System.out.println("Employee is Abscent");
	 		break;
		}
	}	
}
