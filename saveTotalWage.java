public class saveTotalWage
{
	public static final int is_present = 1;
	public static final int ispartime = 2;

	private final String company;
	private final int WagePerHr;
	private final int max_Days;
	private final int max_hours;
	private int totalEmpWage;

	public saveTotalWage(String company,int WagePerHr,int max_Days,int max_hours)
{

		this.company=company;
		this.WagePerHr=WagePerHr;
		this.max_Days=max_Days;
		this.max_hours=max_hours;

}

	public void calcEmpWage()
{
 
	 int days=0, hours=0;

	 while(hours < max_hours && days < max_Days){

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
		totalEmpWage = hours*WagePerHr;

	}


public String tostring()
{
	return "Total emp wage for company: "+company+ "is"+totalEmpWage;
}


	
 		public static void main(String[] args){
	 		saveTotalWage dmart=new saveTotalWage("dmart",20,20,100);
			saveTotalWage reliance=new saveTotalWage("reliance",10,40,200);
				dmart.calcEmpWage();
				System.out.println(dmart);
				reliance.calcEmpWage();
				System.out.println(reliance);
}
}
