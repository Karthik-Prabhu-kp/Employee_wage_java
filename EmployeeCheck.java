public class EmployeeCheck
{
	public static void main(String[] args)
	{
	 int Is_full_time = 1;
	 
	 double empcheck = Math.floor(Math.random()*10) % 2;
	 if (empcheck == Is_full_time)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abscent");
	 }
}
