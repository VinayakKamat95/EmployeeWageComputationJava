public class EmpWageComputation {

        public static void main(String[] args) {

           //CONSTANTS
           // isPartTime = 1
           // isFullTime = 2
	   int EMP_RATE_PER_HR = 20;
	   int NUM_WORKING_DAYS = 20;

            //Variables
            int empHrs = 0;
            int salary = 0;
            int totalSalary = 0;


       for (int day=1; day<=NUM_WORKING_DAYS; day++){
      double randomCheck = Math.floor(Math.random() * 10) % 3;

         switch ( (int)randomCheck ) {

               case 2 :
                empHrs = 8;
            break;

               case 1 :
                empHrs = 4;
            break;

               default :
                empHrs = 0;
         }
         salary = empHrs*EMP_RATE_PER_HR;
         totalSalary=totalSalary+salary;
      }
      System.out.println(totalSalary);
   }
}
