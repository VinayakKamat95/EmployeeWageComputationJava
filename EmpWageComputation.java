public class EmpWageComputation {

	public static void main(String[] args) {

		//CONSTANTS
		int IS_PRESENT = 1;
		double randomCheck = Math.floor(Math.random() * 10) % 2;

		if (randomCheck == IS_PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
