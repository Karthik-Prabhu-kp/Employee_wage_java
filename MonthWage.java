public class MonthWage
{
	public static void main(String[] args)
	{
	 int WagePerHr = 20;
	 int days_in_month=20;

	 int empcheck = (int)(Math.floor(Math.random()*3));

	 switch (empcheck){
	 case 1:
			int full_time=16;
	  		int monthlywag = days_in_month*WagePerHr*full_time;
			System.out.println(monthlywag);
	 		break;
	 case 2: 
			int parttime=8;
        	int monthlywage = days_in_month*WagePerHr*parttime;
            System.out.println(monthlywage);
	 		break;

	 default:
			System.out.println("Employee is Abscent");
	 		break;
		}
	}	
}
