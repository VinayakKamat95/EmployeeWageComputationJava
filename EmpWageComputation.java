public class EmpWageComputation {

        public static void main(String[] args) {

           //CONSTANTS
           // isPartTime = 1
           // isFullTime = 2
      int EMP_RATE_PER_HR = 20;
      int MAX_HRS_IN_MONTH = 50;
      int NUM_WORKING_DAYS = 20;

       //Variables
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;
            int totalSalary = 0;
            int workHrs = 0;

       while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS){
        totalWorkingDays+=1;
   double randomCheck = Math.floor(Math.random() * 10) % 3;

         switch ( (int)randomCheck ) {

               case 2 :
                workHrs+=8;
            break;

               case 1 :
                workHrs+=4;
            break;

               default :
                workHrs+=0;
         }
         totalEmpHrs=totalEmpHrs+workHrs;

      }
      totalSalary=EMP_RATE_PER_HR*totalEmpHrs;
      System.out.println(totalSalary);
   }
}
