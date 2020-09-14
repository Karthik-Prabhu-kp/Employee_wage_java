public interface IComputeEmpWage{
	public void addCompanyEmpWage(String company, int WagePerHr, int max_Days,int max_hours);
	public void computeEmpWage();
	public int getTotalWage(string company);
}

public CompanyEmpWage(String company,int WagePerHr,int max_Days,int max_hours)
{

        this.company=company;
        this.WagePerHr=WagePerHr;
        this.max_Days=max_Days;
        this.max_hours=max_hours;
		totalEmpWage = 0;
}

public void setTotalEmpWage(int tottalEmpWage){
    this.totalEmpWage = totalEmpWage;
}

@Override
public String toString() {
    return "Total Emp Wage for company:" +company+ "is:" +totalEmpWage;
}
}

public class EmpWageBuilder implements IComputeEmpWage{
	
	public static final int is_present = 1;
	public static final int ispartime = 2;

	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<string,CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilder{
		companyEmpWageList = new LinkedList<>();
		companytoEmpWageMap = new HashMap();
}

	private void addCompanyEmpWage(String company,int WagePerHr,int max_Days,int max_hours)
{

	companyEmpWageList.add(companyEmpWage);
	companytoEmpWageMap.put(company, companyEmpWage);
}

	private void computeEmpWage(){
	for (int i =0; i<CompanyEmpWageList.size();i++){
		CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
		companyEmpWage.set TotalEmpWage(this.computerEmpWage(companyEmpWage));
		System.out.println(companyEmpWage);
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
		IComputeEmpWage empWageBuilder=new EmpWageBuilder();
		empWageBuilder.addCompanyEmpwage("reliance",10,4,20);
		empWageBuilder.addComanyEmpWage("Dmart",20,2,10);
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage of dmart"+ EmpWageBuilder.getTotalWage("Dmart"));

		}

