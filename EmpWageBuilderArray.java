public class EmpWageBuilderArray{
	
	public static final int is_present = 1;
	public static final int ispartime = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray(){
		companyEmpWageArray = new CompanyEmpWage[5];
}

	private void addCompanyEmpWage(String company,int WagePerHr,int max_Days,int max_hours)
{

	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,WagePerHr,max_Days,max_hours);
	numOfCompany++;
}

	private void computeEmpWage(){
	for (int i =0; i<numOfCompany;i++){
		companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray[i]);
	}
}

private int computeEmpWage(CompanyEmpWage companyEmpWage)
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
		return totalEmpHrs*companyEmpWage.WagePerHr;

	}



  public static void main(String[] args){
	 	EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpwage("reliance",10,4,20);
		empWageBuilder.addComanyEmpWage("Dmart",20,2,10);
		empWageBuilder.computeEmpWage();
		}
