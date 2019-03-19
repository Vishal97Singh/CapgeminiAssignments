package lab2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Lab6_6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date in dd/MM/yyyy hh:mm:ss");
		String dateStart=sc.nextLine();
		sc.close();
	 
		 Date date=Calendar.getInstance().getTime();
		 DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		 String currDate = df.format(date);
		 System.out.println(currDate);

		    Date d1 = null;
		    Date d2 = null;
		    try {
		        d1 = df.parse(dateStart);
		        d2 = df.parse(currDate);
		    } catch (ParseException e) {
		        System.out.println("Format is not correct");
		    }

		    long diff = d2.getTime() - d1.getTime();
		    long diffHours = diff / (60 * 60 * 1000);
		    long days=diffHours/24;
		    long diffSeconds = (diff / 1000) % 60;
		    long diffMinutes = (diff / (60 * 1000)) % 60;
		   
		    
		    System.out.println("Time in Days: " + days + " days.");
		    System.out.println("Time in hours: " + diffHours + " hours.");
		    System.out.println("Time in minutes: " + diffMinutes + " minutes.");
		    System.out.println("Time in seconds: " + diffSeconds + " seconds.");
		   
		   
	}

}
