// **********************************************************************
// Programmer:	Rob Sveinson
// Class:		CS20S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class EmployeeClient/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[]) throws IOException
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	  
        String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ ]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        String tokens[] = null;
        
        double wage = 0.0; // wage of employee
        int hours = 0; // hours employee has worked
            
	// ***** create objects *****
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
        
        ProgramInfo programInfo = new ProgramInfo("Assignment 3");
        DecimalFormat df = new DecimalFormat("###.##"); 
        ArrayList <Employee> employees = new ArrayList <>(); //initiallizing array list
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
           System.out.println(programInfo.toString());
		
	// ***** get input *****

        strin = fin.readLine();
        
        while (strin != null) {
            tokens = strin.split(delim);
            
            hours = Integer.parseInt(tokens[0]);
            wage = Double.parseDouble(tokens[1]);
            
            employees.add(new Employee(hours, wage));
            
            strin = fin.readLine();
        }// end eof lloop
        
	// ***** processing *****
	
		
	// ***** output *****
	
         for(Employee i: employees) //output data for each employee
            System.out.println(i);
        
        System.out.println("\nEmployee 1's ID is: " + employees.get(0).getID());
        System.out.println("Employee 2's normal pay is: $" + df.format(employees.get(1).getRegularPay()));
        System.out.println("Employee 3's overtime pay is: $" + df.format(employees.get(2).getOvertimePay()));
        System.out.println("Employee 4's gross pay is: $" + df.format(employees.get(3).getGrossPay()));
        System.out.println("Employee 5's hours are: " + employees.get(4).getHours() + "\n");
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
            System.out.println(programInfo.eoFile());
            fout.println(programInfo.eoFile());
	
        // ***** close streams *****
        
        fin.close();            // close input buffer
        fout.close();           // close output buffer
	}  // end main	
}  // end class