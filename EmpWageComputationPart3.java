
public class EmpWageComputationPart3 {
	
	private static final int IS_PRESENT = 1;
	private int WAGE_PER_HOUR = 20;
	private int FULL_DAY_HOUR = 8;
	
	public static double empCheck = (int) Math.floor(Math.random() * 10) % 2;
	//Constructor
	public EmpWageComputationPart3(int WAGE_PER_HOUR, int FULL_DAY_HOUR) {
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
		this.FULL_DAY_HOUR = FULL_DAY_HOUR;
	}
	
	public static void main(String[] args) {
		
		if(empCheck == IS_PRESENT) {
		EmpWageComputationPart3 empWage = new EmpWageComputationPart3(20, 8);
		int dailyWages = (empWage.WAGE_PER_HOUR * empWage.FULL_DAY_HOUR);
		System.out.println("Employee daily wages is: "+dailyWages);
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}
