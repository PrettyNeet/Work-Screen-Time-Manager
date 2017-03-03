 
/*NAME/Date/File
Name:   Brandon Miller and Phong Pham
Date:   11/22/2015
File:   Assignment4.java
*/
 
/*ANALYSIS
Input:
		String dayArray
		int dateArray
		real 2dp workTime
		real 2dp scrnTime
		
Output:
		String dayArray
		int dateArray
		real 2dp workTime
		real 2dp scrnTime
		real 2dp highScrn
		real 2dp highWork
		real 2dp lowScrn
		real 2dp lowWork
		real 2dp totalScrnTime
		real 2dp totalWorkTime
		real 2dp avgScrn
		real 2dp avgWork
		real 2dp numRecords
		real 2dp scrnWeekPercent
		real 2dp workWeekPercent
		String highStringScrn
		String highStringWork
		String lowStringScrn
		String lowStringWork
		
Constants:
 
real 2dp PART_THRESH=50
real 2dp FULL_THRESH=40
int MAX_LINES=7
real 2dp HOURS_WEEK = 168
 
Test Data:

day           date    		workTime        		scrnTime
 
monday          23              8.0                     8.0             8.0/24*100 -> 33.33% working and 08.00/24*100 -> 33.33% screen time
tuesday         24              5.0                     9.0             5.0/24*100 -> 20.83% working and 09.00/24*100 -> 37.50% screen time
wednesday       25              8.5                     7.5             8.0/24*100 -> 35.41% working and 08.00/24*100 -> 33.33% screen time
thursday        26              6.0                     10.0            6.0/24*100 -> 25.00% working and 10.00/24*100 -> 41.66% screen time
friday          27              5.0                     10.0            5.0/24*100 -> 20.83% working and 10.00/24*100 -> 41.66% screen time
saturday        28              2.0                     12.5            2.0/24*100 -> 08.33% working and 12.50/24*100 -> 52.08% screen time
sunday          29              2.5                     12.0            2.5/24*100 -> 10.41% working and 12.00/24*100 -> 50.00% screen time
 
high:   8.5 working wednesday
        12.5 scrnTime saturday
               
low:    2.0 working saturday
        7.5 scrnTime wednesday
 
avg:    
		average work time:(8+5+8.5+6+5+2+2.5)/7 = 5.29
		average scrn time:(8+9+7.5+10+10+12.5+12)/7 = 9.86
 
numRecords: 7
 
total:  

        (8+5+8+6+5+2+2.5)= 37 working
        (8+9+8+10+10+12.5+12) = 69 scrnTime
		69/168 * 100 = 41.06% of the day spent on scrnTime
        37/168 * 100 = 22.02% of the day speant working
 
 
Algorithm:
 
MAIN:
 
initialize variables
P+G outfile name/path
call getInfile
Open infile
Open Outfile
call printDispDate
call printDispTitles
 
for (i = 0; i < MAX_LINES; i++) 
	if(Error check)
    
	else (populate array)

for(i = 0; i < workTime.length; i++)    
	call printDispArray
	call calcHighWork
	call calcHighScrn
	call calcLowWork
	call calcLowScrn
	call highStringWorkMatch
	call lowStringWorkMatch
	call highStringScrnMatch
	call lowStringScrnMatch
	call calcPercentWork
	call calcPercentScrn
	call calcTotalScreen
	call calcTotalWork
	call workPercentZeroCheck(Error checking for 0)
	call scrnPercentZeroCheck(Error checking for 0)

call calcAvgScrn
call calcAvgWork
call scrnZeroCheck(Error checking for division by 0)
call workZeroCheck(Error checking for division by 0)
calc workWeekPercent
calc scrnWeekPercent
      
call PrintOtherTitles
call printDispEverything
call PrintOtherTitles2
call printDispEverything2
call printMatchStrings

switch partime/full time
	fulltime
		if thresholds
			print suggestions
                               
                       
	partime
		if thresholds
			print suggestions
	default
		Error checking
			print Error
								
close outfile
close infile

end main

METHODS:

Method Name:            PrintOtherTitles
Return Value:           none
Input Parameters:       UtilityClass outfile
Output Parameters:      none
Functionality:          prints titles for outputs

Method Name:            PrintOtherTitles2
Return Value:           none
Input Parameters:       UtilityClass outfile
Output Parameters:      none
Functionality:          prints titles for outputs

Method Name:            workPercentZeroCheck
Return Value:           none
Input Parameters:       real workPercent,int i
Output Parameters:      none
Functionality:          error checks for 0 in percentage calc

Method Name:            scrnPercentZeroCheck
Return Value:           none
Input Parameters:       real scrnPercent,int i
Output Parameters:      none
Functionality:          error checks for 0 in percentage calc

Method Name:            scrnZeroCheck
Return Value:           none
Input Parameters:       real avgScrn
Output Parameters:      none
Functionality:          error checks for 0 in average calc

Method Name:            workZeroCheck
Return Value:           none
Input Parameters:       real avgWork
Output Parameters:      none
Functionality:          error checks for 0 in average calc
 
Method Name:            getInFile
Return Value:           file
Input Parameters:       none
Output Parameters:      none
Functionality:          get infile and path name
 
Method Name:            printDispDate
Return Value:           void
Input Parameters:       UtilityClass outfile
Output Parameters:      none
Functionality:          print and display current date, company name, programmer's names from UtilityClass
 
Method Name:            printDispTitles
Return Value:           void
Input Parameters:       UtilityClass outfile
Output Parameters:      none
Functionality:          print and display titles for columns for data records
 
Method Name:            printDispEverything
Return Value:           void
Input Parameters:       real 2dp highScrn,real 2dp highWork,real 2dp lowScrn,real 2dp lowWork,real 2dp totalScrnTime,real 2dp totalWorkTime,UtilityClass outfile
Output Parameters:      none
Functionality:          print and display: highScrn,highWork,lowScrn,lowWork,totalScrnTime,totalWorkTime

Method Name:            printDispEverything2
Return Value:           void
Input Parameters:       real 2dp avgScrn, real 2dp avgWork, UtilityClass outfile,real 2dp numRecords,real 2dp scrnWeekPercent,real 2dp workWeekPercent
Output Parameters:      none
Functionality:          print and display: avgScrn.avgWork,numRecords,scrnWeekPercent,workWeekPercent

Method Name:            printMatchStrings
Return Value:           void
Input Parameters:       String highStringScrn,String highStringWork,String lowStringScrn,String lowStringWork,real 2dp highWork,real 2dp highScrn,real 2dp lowWork,real 2dp lowScrn, UtilityClass outfile
Output Parameters:      none
Functionality:          print and display: high and low work/scrn with their respective days
 
Method Name:            calcPercentWork
Return Value:           real 2dp workPercent
Input Parameters:       int i,real 2dp workTime
Output Parameters:      none
Functionality:          calculates the percentage of the day spent working, and returns that value
 
Method Name:            calcPercentScrn
Return Value:           real 2dp scrnPercent
Input Parameters:       int i,real 2dp scrnTime
Output Parameters:      none
Functionality:          calculates the percentage of the day spent on screen time, returns that value
 
Method Name:            calcHighWork
Return Value:           real 2dp highWork
Input Parameters:       int i, real 2dp workTime
Output Parameters:      none
Functionality:          calculates the highest value of workPercent and returns it
 
Method Name:            calcLowWork
Return Value:           real 2dp lowWork
Input Parameters:       int i,real 2dp workTime
Output Parameters:      none
Functionality:          calculates the lowest value of workPercent and returns it
 
Method Name:            calcHighScrn
Return Value:           real 2dp highScrn
Input Parameters:       int i,real 2dp scrnTime
Output Parameters:      none
Functionality:          calculates the highest value of scrnPercent and returns it
 
Method Name:            calcLowScrn
Return Value:           lowScrn
Input Parameters:       int i,real 2dp scrnTime
Output Parameters:      none
Functionality:          calculates the lowest value of scrnPercent and returns it
 
Method Name:            highStringWorkMatch
Return Value:           String highStringWork
Input Parameters:       int i,String dayArray,real 2dp workTime,real 2dp highWork
Output Parameters:      none
Functionality:          matches the worktime to highWork at i, set day array at i to highStringWork
 
Method Name:            lowStringWorkMatch
Return Value:           String lowStringWork
Input Parameters:       int i,String dayArray,real 2dp workTime,real 2dp lowWork
Output Parameters:      none
Functionality:          matches the worktime to lowWork at i, set day array at i to lowStringWork
 
Method Name:            highStringScrnMatch
Return Value:           String highStringScrn
Input Parameters:       int i,String dayArray,real 2dp scrnTime,real 2dp highScrn
Output Parameters:      none
Functionality:			matches the scrnTime to highScrn at i, sets day array at i to highStringScrn
 
Method Name:            lowStringScrnMatch
Return Value:           String lowStringScrn
Input Parameters:       int i,String dayArray,real 2dp scrnTime,real 2dp lowScrn
Output Parameters:      none
Functionality:         	matches the scrnTime to lowScrn at i, sets day array at i to lowStringScrn
 
Method Name:            calcTotalScreen
Return Value:          	real 2dp totalScreen
Input Parameters:       int i,real 2dp scrnTime,real 2dp totalScrnTime
Output Parameters:      none
Functionality:          calculates the total screen time and returns it
 
Method Name:            calcTotalWork
Return Value:           real 2dp totalWork
Input Parameters:       int i,real 2dp workTime,real 2dp totalWorkTime
Output Parameters:      none
Functionality:          calculates the total work time and returns it
 
Method Name:            calcAvgScrn
Return Value:           real 2dp avgScrn
Input Parameters:       real 2dp totalScrnTime,real 2dp numRecords
Output Parameters:      none
Functionality:          calculates the average screen time and returns it
 
Method Name:            calcAvgWork
Return Value:           real 2dp avgWork
Input Parameters:       real 2dp totalWorkTime,real 2dp numRecords
Output Parameters:      none
Functionality:          calculates the average work time and returns it
 
Method Name:            printDispArray
Return Value:           void
Input Parameters:       UtilityClass outfile, int i, int dateArray, String dayArray,real 2dp workTime,real 2dp scrnTime
Output Parameters:      none
Functionality:          print and display arrays
 
*/
 
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
 
public class assignment4
{
	static final double PART_THRESH = 50.0;		//threshold for part time percentage calc
	static final double FULL_THRESH = 40.0;		//threshold for full time percentage calc
	static final int MAX_LINES = 7;             // number of days in input file, sets limit
	static final double HOURS_WEEK = 168;       // number of hours/week
	static Scanner sc = new Scanner(System.in); // scanner outside of main so methods can see it

	public static void main(String[] args) throws IOException
	
	{
	

		// initialize variables
		int i = 0;
		double numRecords = 0;
		int[] dateArray = new int[MAX_LINES];
		double highScrn = 0;
		double highWork = 0;
		double lowWork = 25;
		double lowScrn = 25;
		double totalScrnTime = 0;
		double totalWorkTime = 0;
		double avgWork = 0;
		double avgScrn = 0;
		double scrnWeekPercent = 0;
		double workWeekPercent = 0.0;
		double[] workTime = new double[MAX_LINES];
		double[] scrnTime = new double[MAX_LINES];
		double[] workPercent = new double[MAX_LINES];
		double[] scrnPercent = new double[MAX_LINES];
		String[] dayArray = new String[MAX_LINES];
		String Out;
		String file;
		String highStringScrn="";
		String lowStringScrn="";
		String highStringWork="";
		String lowStringWork="";
		String infile_name = getInFile();
		char workType;
	   
		UtilityClassIn infile = new UtilityClassIn(infile_name);
		infile.openInFile();
		String line="";

		Out=JOptionPane.showInputDialog("Please enter the path and file to which you wish to save the output:");
		UtilityClass outfile = new UtilityClass(Out); // create a new instance
																										// of UtilityClass
		outfile.openFile(); // call to method openFile from UtilityClass
		printDispDate(outfile);
		printDispTitles(outfile);
		
		for (i = 0; i < MAX_LINES; i++) 
		{
			
			line = infile.readLineFromFile();
			String[] nextfield = line.split(",");
			if (nextfield[0].equals("")) 
			{
				System.out.println("ERROR! Blank field where day is expected");
				System.exit(-1);
			}
			if (nextfield[1].equals("")) 
			{
				System.out.println("ERROR! Blank field where date is expected");
				System.exit(-1);
			}
			if (nextfield[2].equals("")) 
			{
				System.out.println("ERROR! Blank field where work time is expected");
				System.exit(-1);
			}
			if (nextfield[3].equals("")) 
			{
				System.out.println("ERROR! Blank field where screen time is expected");
				System.exit(-1);
			} 
			else 
			{
				dayArray[i] = (nextfield[0]);
				dayArray[i]=dayArray[i].toUpperCase().substring(0,1)+dayArray[i].toLowerCase().substring(1);
				dateArray[i] = Integer.parseInt(nextfield[1]);
				workTime[i] = Double.parseDouble(nextfield[2]);
				scrnTime[i] = Double.parseDouble(nextfield[3]);
				

				numRecords++;
			}
		} //end for
		
		for (i = 0; i < workTime.length; i++)
		{
			// method calls
			printDispArray(outfile, i, dateArray, dayArray, workTime, scrnTime);
			highWork = calcHighWork(workTime, i, highWork);
			highScrn = calcHighScrn(scrnTime, i, highScrn);
			lowWork = calcLowWork(workTime, i, lowWork);
			lowScrn = calcLowScrn(scrnTime, lowScrn, i);
			highStringWork = highStringWorkMatch(i, highWork, dayArray, workTime, highStringWork);
			lowStringWork = lowStringWorkMatch(i, lowWork, dayArray, workTime, lowStringWork);
			highStringScrn = highStringScrnMatch(i, highScrn, dayArray, scrnTime, highStringScrn);
			lowStringScrn = lowStringScrnMatch(i, lowScrn, dayArray, scrnTime, lowStringScrn);
			workPercent = calcPercentWork(i, workTime, workPercent);
			scrnPercent = calcPercentScrn(i, scrnTime, scrnPercent);
			totalScrnTime = calcTotalScreen(i, scrnTime, totalScrnTime);
			totalWorkTime = calcTotalWork(i, workTime, totalWorkTime);
			workPercentZeroCheck(workPercent,i); //error check for value of 0
			scrnPercentZeroCheck(workPercent,i);

		} // end the for loop
		
		// calculate averages
		avgScrn = calcAvgScrn(totalScrnTime, numRecords, avgScrn);
		avgWork = calcAvgWork(totalWorkTime, numRecords, avgWork);
	   
		scrnZeroCheck(avgScrn); //error check for divide by zero
		workZeroCheck(avgWork);
	   
		System.out.println("\nPlease enter your work hours classification. F for full-time and P for part-time.");
	   
		workWeekPercent = (totalWorkTime/HOURS_WEEK) * 100.0;
		scrnWeekPercent = (totalScrnTime/HOURS_WEEK) * 100.0;
		workType = sc.next().toUpperCase().charAt(0);
	   
		//method call for printDispEverything
		PrintOtherTitles(outfile);
		printDispEverything(highScrn,highWork,lowScrn,lowWork,totalScrnTime,totalWorkTime,outfile);
		PrintOtherTitles2(outfile);
		printDispEverything2(avgScrn,avgWork,outfile,numRecords,scrnWeekPercent,workWeekPercent);
		printMatchStrings(highStringScrn,highStringWork,lowStringScrn,lowStringWork,highWork,highScrn,lowWork,lowScrn,outfile);

		switch (workType)
		{
			case 'F':
			{
				if(workWeekPercent<scrnWeekPercent)
				{
					if(scrnWeekPercent>=FULL_THRESH)
					{
							System.out.println("\n\nYou spent over 40% of your week on Screen Time\nYou are more than likely cutting time from sleep and other daily routines\nReavaluate your schedule to spend your free time more constructively");
							outfile.writeLineToFile("\n\nYou spent over 40%% of your week on Screen Time\nYou are more than likely cutting time from sleep and other daily routines\nReavaluate your schedule to spend your free time more constructively");
					}
					else
					{
							System.out.println("\n\nYour screen time is over your work time\nBut is less than 40% of your week\nRe-evaluate your schedule to include other things than screen time");
							outfile.writeLineToFile("\n\nYour screen time is over your work time\nBut is less than 40%% of your week\nRe-evaluate your schedule to include other things than screen time");
					}
					   
				}
				
				else
				{
					System.out.println("\n\nYou spent more time working this week than taking time off\nTake time to re-evaluate your scehdule for a comfortable time off ");
					outfile.writeLineToFile("\n\nYou spent more time working this week than taking time off\nTake time to re-evaluate your scehdule for a comfortable time off ");
				}
				break;
			}//end case F
			
			case 'P':
			{
				if(workWeekPercent<scrnWeekPercent)
				{
					if(scrnWeekPercent>=PART_THRESH)
					{
						System.out.println("\n\nYou spent over 50% of your week on Screen Time\nYou are more than likely cutting time from sleep and other daily routines to play games/browse the internet\nReavaluate your schedule to spend your free time more constructively");
						outfile.writeLineToFile("\n\nYou spent over 50%% of your week on Screen Time\nYou are more than likely cutting time from sleep and other daily routines to play games/browse the internet\nReavaluate your schedule to spend your free time more constructively");
					}
					else
					{
							System.out.println("\n\nYour screen time is over your work time\nBut is less than 40% of your week\nRe-evaluate your schedule to include other things than screen time");
							outfile.writeLineToFile("\n\nYour screen time is over your work time\nBut is less than 40%% of your week\nRe-evaluate your schedule to include other things than screen time");
					}
					
				}
				else
				{
					System.out.println("\n\nYou spent more time working this week than taking time off\nTake time to re-evaluate your scehdule for a comfortable time off ");
					outfile.writeLineToFile("\n\nYou spent more time working this week than taking time off\nTake time to re-evaluate your scehdule for a comfortable time off ");
				}
				break;
			}//end case P
			default:
			{
					System.out.printf("\n\n!ERROR! INVALID HOURS CLASSIFICATION!\n%c is not F or P, learn to read!\n", workType);
			}//end default
		
		}//end switch
	   
		outfile.closeFile();
		infile.closeInFile();
	
	}// end main
	
	public static void PrintOtherTitles(UtilityClass outfile)
	{
		System.out.println("-----------------------------------------------------------");
		System.out.println("H/L SCRN\tH/L WORK\tTOTAL WORK\tTOTAL SCRN");
		System.out.println("-----------------------------------------------------------");
		outfile.writeLineToFile("----------------------------------------------");
		outfile.writeLineToFile("\nH/L SCRN\tH/L WORK\tTOTAL WORK\tTOTAL SCRN\n");
		outfile.writeLineToFile("----------------------------------------------");
	}
	public static void PrintOtherTitles2(UtilityClass outfile)
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("AVG WORK\tAVG SCRN\tNUM RECS\tTOTAL SCRN %\tTOTAL WORK %");
		System.out.println("----------------------------------------------------------------------------");
		outfile.writeLineToFile("----------------------------------------------------------------");
		outfile.writeLineToFile("\nAVG WORK\tAVG SCRN\tNUM RECS\tTOTAL SCRN %%\tTOTAL WORK %%");
		outfile.writeLineToFile("\n----------------------------------------------------------------\n");
	}
	
	public static void workPercentZeroCheck(double [] workPercent,int i)
	{
		int zero=0;
		if(workPercent[i]==zero)
		{
			System.out.println("!ERROR! Cannot have a zero in values, check input values.");
			System.exit(-1);

		}
	}
	public static void scrnPercentZeroCheck(double[] scrnPercent,int i)
	{
		int zero=0;
		if(scrnPercent[i]==zero)
		{
			System.out.println("!ERROR! Cannot have a zero in values, check input values.");
			System.exit(-1);
		}
	}
	public static void scrnZeroCheck(double avgScrn)
	{
		int zero =0;
		if (avgScrn==zero)
			{
				System.out.println("!ERROR! Cannot divide by zero in Screen time average calculation, please check inputs");
				System.exit(-1);
			}
	}
	public static void workZeroCheck(double avgWork)
	{
		if (avgWork==0)
			{
				System.out.println("!ERROR! Cannot divide by zero in Work time average calculation, please check inputs");
				System.exit(-1);
			}
	}
	public static String getInFile() 
	{
		String infile_2;
		System.out.println("Please enter the name/path for the infile:");
		infile_2 = sc.nextLine();
		return infile_2;
	}
	public static void printDispDate(UtilityClass outfile) 
	{
		String name = outfile.myName();
		String date = outfile.myDate();
		System.out.println(date);
		outfile.writeLineToFile(date);
		System.out.println(name);
		outfile.writeLineToFile(name);
		System.out.printf("Company Name: NaCl Consulting\n");
		outfile.writeLineToFile("Company Name: NaCl Consulting\n");
	}
	public static void printDispTitles(UtilityClass outfile) 
	{
		System.out.println("---------------------------------------------------");
		System.out.println("DAY\t\tDATE\tWORK TIME\tSCREEN TIME");
		System.out.println("---------------------------------------------------");
		outfile.writeLineToFile("---------------------------------------");
		outfile.writeLineToFile("\nDAY\t\tDATE\tWORK TIME\tSCREEN TIME\n");
		outfile.writeLineToFile("---------------------------------------\n");
	}
	public static void printDispEverything(double highScrn,double highWork,double lowScrn,double lowWork,double totalScrnTime,double totalWorkTime,UtilityClass outfile) 
	{
		System.out.printf("%8.2f\t%8.2f\t%10.2f\t%10.2f",highScrn,highWork,totalWorkTime,totalScrnTime);
		System.out.printf("\n%8.2f\t%8.2f\n",lowScrn,lowWork);   
		outfile.writeLineToFile("\n%8.2f\t%8.2f\t%10.2f\t%10.2f\n",highScrn,highWork,totalWorkTime,totalScrnTime);
		outfile.writeLineToFile("%8.2f\t%8.2f\n",lowScrn,lowWork);   
	}
	public static void printDispEverything2(double avgScrn, double avgWork, UtilityClass outfile,double numRecords,double scrnWeekPercent,double workWeekPercent)
	{
		System.out.printf("%8.2f\t%8.2f\t%8.2f\t%10.2f\t%10.2f",avgWork,avgScrn,numRecords,scrnWeekPercent,workWeekPercent);
		outfile.writeLineToFile("%8.2f\t%8.2f\t%8.2f\t%10.2f\t%10.2f",avgWork,avgScrn,numRecords,scrnWeekPercent,workWeekPercent);
	}
	public static void printMatchStrings(String highStringScrn,String highStringWork,String lowStringScrn,String lowStringWork,double highWork,double highScrn,double lowWork,double lowScrn, UtilityClass outfile)
	{
        System.out.printf("\n\nThe highest time spent on screen time was: %-4.2f and was on a %s",highScrn,highStringScrn);
        System.out.printf("\nThe lowest time spent on screen time was: %-4.2f and was on a %s",lowScrn,lowStringScrn);
        System.out.printf("\nThe highest time spent on work was: %-4.2f and was on a %s",highWork,highStringWork);
        System.out.printf("\nThe lowest time spent on work was: %-4.2f and was on a %s",lowWork,lowStringWork);
		
		outfile.writeLineToFile("\n\nThe highest time spent on screen time was: %-4.2f and was on a %s",highScrn,highStringScrn);
        outfile.writeLineToFile("\nThe lowest time spent on screen time was: %-4.2f and was on a %s",lowScrn,lowStringScrn);
        outfile.writeLineToFile("\nThe highest time spent on work was: %-4.2f and was on a %s",highWork,highStringWork);
        outfile.writeLineToFile("\nThe lowest time spent on work was: %-4.2f and was on a %s",lowWork,lowStringWork);
	}

	public static double[] calcPercentWork(int i, double[] workTime, double[] workPercent) 
	{
		workPercent[i] = (workTime[i] / 24.0) * 100.0;
		return workPercent;
	}

	public static double[] calcPercentScrn(int i, double[] scrnTime, double[] scrnPercent)
	{
		scrnPercent[i] = ((scrnTime[i] / 24.0) * 100.0);
		return scrnPercent;
	}

	public static double calcHighWork(double[] workTime, int i, double highWork)
	{
		if (workTime[i] > highWork) 
		{
			highWork = workTime[i];
		}
		return highWork;
	}
	public static double calcHighScrn(double[] scrnTime, int i, double highScrn)
	{
		if (scrnTime[i] > highScrn) 
		{
			highScrn = scrnTime[i];
		}
		return highScrn;
	}
	public static double calcLowWork(double[] workTime, int i, double lowWork)
	{
		if (workTime[i] < lowWork)
		{
			lowWork = workTime[i];
		}
		return lowWork;
	}
	public static double calcLowScrn(double[] scrnTime, double lowScrn, int i)
	{
		if (scrnTime[i] < lowScrn)
		{
			lowScrn = scrnTime[i];
		}
		return lowScrn;
	}
	public static String highStringWorkMatch(int i, double highWork, String[] dayArray, double[] workTime,String highStringWork)
	{
		if (workTime[i] == highWork)
		{
			highStringWork = dayArray[i];
		}
		return highStringWork;
	}
	public static String lowStringWorkMatch(int i, double lowWork, String[] dayArray, double[] workTime,String lowStringWork)
	{
		if (workTime[i] == lowWork)
		{
			lowStringWork = dayArray[i];
		}
		return lowStringWork;
	}
	public static String highStringScrnMatch(int i, double highScrn, String[] dayArray, double[] scrnTime,String highStringScrn)
	{
		if (scrnTime[i] == highScrn)
		{
			highStringScrn = dayArray[i];
		}
		return highStringScrn;
	}
	public static String lowStringScrnMatch(int i, double lowScrn, String[] dayArray, double[] scrnTime,String lowStringScrn)
	{
			if (scrnTime[i] == lowScrn)
			{
				lowStringScrn = dayArray[i];
			}
			return lowStringScrn;
	}

	public static double calcTotalScreen(int i, double[] scrnTime, double totalScrnTime)
	{
			totalScrnTime += scrnTime[i];
			return totalScrnTime;
	}
	public static double calcTotalWork(int i, double[] workTime, double totalWorkTime)
	{
			totalWorkTime += workTime[i];
			return totalWorkTime;
	}

	public static double calcAvgScrn(double totalScrnTime, double numRecords, double avgScrn)
	{
			avgScrn = (totalScrnTime / numRecords);
			return avgScrn;
	}
	public static double calcAvgWork(double totalWorkTime, double numRecords, double avgWork)
	{
			avgWork = (totalWorkTime / numRecords);
			return avgWork;
	}
	public static void printDispArray(UtilityClass outfile, int i, int[] dateArray, String[] dayArray,double[] workTime, double[] scrnTime)
	{
			System.out.printf("%-10s\t%4d\t%8.2f\t%8.2f\n", dayArray[i], dateArray[i], workTime[i], scrnTime[i]);
			outfile.writeLineToFile("%-10s\t%4d\t%8.2f\t%8.2f\n", dayArray[i], dateArray[i], workTime[i], scrnTime[i]);
	}

}//end class