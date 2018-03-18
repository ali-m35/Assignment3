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
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
        BufferedReader fin = null; // read from disk
        
        double wage = 0.0; // wage of employee
        int hours = 0; // hours employee has worked
        
        ArrayList <Employee> employees = new ArrayList(); //initiallizing array list
    	  
            
	// ***** create objects *****
	 
        try{
            fin = new BufferedReader(new FileReader("employeedata.txt"));
        } // end try
        catch(FileNotFoundException e){
            System.out.println("file not found");
        } // end catch
        
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME: Hanzala Ali");
		System.out.println("Class: CS30S");
		System.out.println("Assignment: Assignment 3");
		System.out.println("**********************************");
		
	// ***** get input *****

        strin = fin.readLine();
        
        while (strin != null) {
            hours = Integer.parseInt(strin);
            wage = Double.parseDouble(strin);
            employees.add(new Employee (hours, (int) wage));
            
            strin = fin.readLine();
        }// end eof lloop
        
	// ***** processing *****
	
		
	// ***** output *****
	
        System.out.println(employees.toString());
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class