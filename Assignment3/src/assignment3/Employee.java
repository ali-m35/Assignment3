/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Employee
 {  // begin class
 	
 	// *********** class constants **********
 	
        private static int nextID = 1000;
 	
 	// ********** instance variable **********
 	
        private int employeeID = 0;
        private double hourlyWage = 0.0;
        private int numberOfHours = 0;
        
 	// ********** constructors ***********
 	
         /**************************************************
         * Purpose:    create a new employee object with default 
         * properties
         * 
         * Interface:
         * in:         none
         * returns:    none
         **************************************************/
      public Employee(){
         employeeID = nextID++;     // set id and incremnet next id
         numberOfHours = 0;
         hourlyWage = 0.0;
      } // end default constructor
      
        /**************************************************
         * Purpose:    create a new employee object with default 
         * properties
         * 
         * Interface:
         * in:         none
         * returns:    none
         **************************************************/
      public Employee(double r, int e){
          employeeID = nextID++;
          numberOfHours = e;
          hourlyWage = r;
      }// end initialized constructor
       
         /**************************************************
         * Purpose:    get hourly wage of employee 
         * properties
         * 
         * Interface:
         * in:         none
         * returns:    the hourly wage
         **************************************************/
      public double getWage() {
          return hourlyWage;
      }// end getWage
      
      /**************************************************
      * Purpose:    get the employees hours worked
      * 
      * Interface:
      * in:         none
      * returns:    number of hours
      **************************************************/
     public int getHours() {
         return numberOfHours;
     }// end getHours
     
      /**************************************************
      * Purpose:    get the id of the employee
      * 
      * Interface:
      * in:         none
      * returns:    the employees id
      **************************************************/
     public int getID() {
         return employeeID;
     }// end getID
     
      /**************************************************
      * Purpose:    get the grosspay of the employee
      * 
      * Interface:
      * in:         none
      * returns:    the employees grosspay
      **************************************************/
     
     public double getGrossPay() {
         
         return this.numberOfHours * this.hourlyWage;
     }// end getGrossPay
     
       /**************************************************
      * Purpose:    get the grosspay of the employee
      * 
      * Interface:
      * in:         none
      * returns:    the employees grosspay
      **************************************************/
     public double getRegularPay() {
         return this.getGrossPay()- 0.15;
     }// end getRegularPay
     
 	// ********** accessors **********
 	
      /**************************************************
      * Purpose:    returns a string of all the employee properties
      * 
      * Interface:
      * in:         none
      * returns:    the employees properties
      **************************************************/
     public String toString(){
         String info = "";
         
         info = String.format("ID: %16d\n",this.getID());
         info += String.format("Gross Pay: %16.5f\n", this.getGrossPay());
         info += String.format("Hours Worked: %16.5f\n", this.getHours());
         info += String.format("Wage: %16.5f\n", this.getWage());
         info += String.format("Regular Pay: %16.5f\n", this.getRegularPay());
         info += String.format("\n\n");
         
         return info;
     } // end toString
     
 	// ********** mutators **********
 
 }  // end class