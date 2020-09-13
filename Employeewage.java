public class Employeewage
{
	public static final int WagePerHr = 20;
	public static final int days_in_month=20;
	public static final int max_hours=100;
	public static final int max_days=20;
	 int days=0;
	 int hours=0;

	public static int computeEmpWage(){

	 int days=0, hours=0;
	 int empcheck = (int)(Math.floor(Math.random()*3));

	 while ( hours<max_hours || days<max_days ){

	  days=days+1; 
	
	 switch (empcheck){
	 case 1:
			int full_time=16;
			hours=hours+16;
	 		break;
	 case 2: 
			int parttime=8;
			hours=hours+8;
	 		break;

	 default:
			System.out.println("Employee is Abscent");
	 		break;
			}
	
		}
		int totalwage = hours*WagePerHr;
        System.out.println("total wage:" + totalwage);
        return totalwage;

	}
	
 		public static void main(String[] args){
		computeEmpWage();
}
}
