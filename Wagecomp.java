public class Wagecomp
{
	public static final int is_present = 1;
	public static final int ispartime = 2;

	 

	public static int CalcEmpWage(String company,int WagePerHr,int max_days,int max_hours)
{

	 int days=0, hours=0;

	 while ( hours<max_hours && days<max_days ){

	  int empcheck = (int)(Math.floor(Math.random()*10)% 3);


	  days=days+1; 
	
	 switch (empcheck){
	 case is_present:
			int full_time=8;
			hours=hours+8;
	 		break;
	 case ispartime: 
			int parttime=4;
			hours=hours+4;
	 		break;

	 default:
			System.out.println("Employee is Abscent");
	 		break;
			}
		System.out.println("total days:" +days + "hours worked:" + hours);
	
		}
		int totalwage = hours*WagePerHr;
        System.out.println("total wage:" + totalwage);
        return totalwage;

	}
	
 		public static void main(String[] args){
		CalcEmpWage("more",25,20,100);
		CalcEmpWage("reliance",15,26,160);
}
}
