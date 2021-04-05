public class EmpWageComputation {

	public static void main(String[] args) {

		//CONSTANTS
		int IS_PRESENT = 1;
		//Variables
		int empRatePerHr = 0;
		int empHrs = 0;
		int salary = 0;
		double randomCheck = Math.floor(Math.random() * 10) % 2;

		if (randomCheck == IS_PRESENT){
			empRatePerHr = 20;
			empHrs = 8;
			salary = empHrs*empRatePerHr;}
		else
			salary=0;
		System.out.println(salary);
		}
}
