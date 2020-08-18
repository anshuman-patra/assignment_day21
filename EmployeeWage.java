public class EmployeeWage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUMBER_WORKING_DAYS=20;
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage problem");
		int empHrs=0;
		int empWage=0;
		int totalSalary=0;

		for(int i=0; i<NUMBER_WORKING_DAYS; i++)
		{
			int randomCheck=(int) (Math.random()*10)%3;
			switch(randomCheck)
			{
				case FULL_TIME:
					empHrs=8;
					break;
				case PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			empWage=EMP_RATE_PER_HOUR*empHrs;
			System.out.println("Employee daily wage:" + empWage);
			totalSalary=totalSalary+empWage;
		}
		System.out.println("Total employee wage:" + totalSalary);
	}
}
