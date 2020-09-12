public class MonthlyLimit
{
	public static void main(String[] args)
	{
	 int WagePerHr = 20;
	 int days_in_month=20;
	 int max_hours=100;
	 int max_days=20;
	 int days=0;
	 int hours=0;

	 int empcheck = (int)(Math.floor(Math.random()*3));

	 while ( hours<max_hours || days<max_days ){
	  days=days+1; 
	
	 switch (empcheck){
	 case 1:
			int full_time=16;
			hours=hours+16;
	  		int monthlywag = days_in_month*WagePerHr*full_time;
			int currentwage = days*WagePerHr*hours;
			System.out.println(currentwage);
			System.out.println(monthlywag);
	 		break;
	 case 2: 
			int parttime=8;
			hours=hours+8;
        	int monthlywage = days_in_month*WagePerHr*parttime;
			int currentwag=days*WagePerHr*hours;
			System.out.println(currentwag);
            System.out.println(monthlywage);
	 		break;

	 default:
			System.out.println("Employee is Abscent");
	 		break;
			}
		}
	}	
}
