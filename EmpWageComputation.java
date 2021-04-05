public class EmpWageComputation {

        public static void main(String[] args) {

           //CONSTANTS
           // isPartTime = 1
           // isFullTime = 2

            //Variables
            int empRatePerHr = 20;
            int empHrs = 0;
            int salary = 0;
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
            salary = empHrs*empRatePerHr;
            System.out.println(salary);
   }

}
