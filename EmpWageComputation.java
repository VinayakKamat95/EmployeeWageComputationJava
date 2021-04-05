public class EmpWageComputation {

        public static void main(String[] args) {

           //CONSTANTS
            int isPartTime = 1;
            int isFullTime = 2;

            //Variables
            int empRatePerHr = 20;
            int empHrs = 0;
            int salary = 0;
            double randomCheck = Math.floor(Math.random() * 10) % 3;

            if (randomCheck == isFullTime)
               empHrs = 8;

            else if (randomCheck == isPartTime)
               empHrs = 4;

            else
               empHrs = 0;

            salary = empHrs*empRatePerHr;
            System.out.println(salary);
   }
}
