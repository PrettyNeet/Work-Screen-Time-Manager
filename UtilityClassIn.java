/*
Utitlity that handles operations with Input File
Brandon Miller
Harv Peters
oct 7, 2015
*/

import java.text.SimpleDateFormat;
import java.io.*;

public class UtilityClassIn
{
	//Attributes
	private String inFilenname;
	private BufferedReader txtFile;
	
	public UtilityClassIn(String inFilenname) //constructor for Output class - must have same name as .java file
	{
		this.inFilenname=inFilenname; //inFilenname is used as parameter for the constructor for input
	}
	//user defined methods
	public void openInFile()
	{
		try
		{
			//FileReader must be read frist then BufferedReader
			FileReader in = new FileReader(inFilenname);
			txtFile = new BufferedReader(in);
		}
		catch (IOException ioE)
		{
			//what happens if this exception is found
			ioE.printStackTrace();
			System.out.println("InFilename incorrect - check path");
			System.exit(-1);
			
		}
		catch(Exception e)
		{
			System.out.println("Error reading infile");
			System.exit(-1);
		}
	}//end method openInFile
	public String readLineFromFile()
	{
		String lineFromFile=null;
		
		try
		{
			lineFromFile=txtFile.readLine();
		}
		catch (IOException ioE)
		{
			//what happens if this exception is found
			System.out.println("Can't read from input file.");
			System.exit(-1);
		}
		return lineFromFile;
	}
	public void closeInFile()
	{
		try
		{
			txtFile.close();
		}
		catch (IOException ioE)
		{
			//what happends if this exception is found
			System.out.println("Problem closing input file.");
			System.exit(-1);
		}
	}
}