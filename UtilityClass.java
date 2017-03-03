/*

Utility that handles operations with output file
Brandon Miller
Sep 23

*/

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.swing.JOptionPane;

public class UtilityClass
{
	//Attributes
	private String filename;
	private PrintWriter rptfile;
	
	public UtilityClass(String filename) //Constructor for utilityClass class - must use same name as class parameter in te parameter list is string filename, so that the filename can be passed into the new instance of the class in main
	
	//UtilityClass outfile = new UtilityClass("c:\\java08\\module4CharsandSwitches\\xxxxx.rpt"); is wirtten in main
	{
		this.filename=filename; // filename is used as a parameter for the contructor for the Output therefore, this is used to distinguish between the parameters of the contructor end for constructor for filename
	}
	
		public void openFile() //open file - makes connection with disk file
		{
			try
			{
				FileWriter fw = new FileWriter(filename,true); //makes a connection to the file and puts data in file
				rptfile=new PrintWriter(fw); //prints the output to the filewriter
			}
			catch (IOException ioE)
			{
				//what happens if this exception is found
				System.out.println("OutFilename incorrect - ILLEGAL OPPERATION - check path");
				System.exit(0); //normal exit
				
			}
			catch (Exception e) //a catcher for all exceptions over and above an I/O exception
			{
				System.out.println("ERROR: " + e.getMessage());
				System.exit(1); //not normal exit
			}
		}//end method openFile
		
		//write line to the output file
		public void writeLineToFile(String str, Object... args)
		{
			//this method is made generic by using a variable argument number object... args which allows a variable number of arguments of any type, then when we use the args to do a formatted print and flush the buffer to the file
			
			rptfile.printf(str,args);
			rptfile.flush();
		}//end method writeLineToFile
		
		//close file
		
		public void closeFile()
		{
			rptfile.close();		
		}//end method closeFile
		
		public String myDate()
		{
			SimpleDateFormat brandonDateFormat = new SimpleDateFormat("MMMM-dd-yyyy");
			Date date = new Date();
			System.out.println();
			return new String("Date is "+ brandonDateFormat.format(date)+"\n"); //returns a string
		}//end method myDate
		
		public String myName() //is a string data type cause it returns a String
		{
			return new String ("This program is written by Brandon Miller & Phong Pham\n"); //returns a String
		}//end method myName
} //end UtilityClass