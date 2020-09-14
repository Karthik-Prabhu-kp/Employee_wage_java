public class CompanyEmpWage{

	public final String company;
	public final int WagePerHr;
	private final int max_Days;
	private final int max_hours;
	private int totalEmpWage;
 
	public CompanyEmpWage(String company,int WagePerHr,int max_Days,int max_hours)
{

		this.company=company;
		this.WagePerHr=WagePerHr;
		this.max_Days=max_Days;
		this.max_hours=max_hours;

}

public void setTotalEmpWage(int tottalEmpWage){
	this.totalEmpWage = totalEmpWage;
}

@Override
public String toString() {
	return "Total Emp Wage for company:" +company+ "is:" +totalEmpWage;
}
}
