package chapter2.projects;

import java.util.*;

public class DateCalculator{
	public static void main(String[] args) {
		
		GregorianCalendar today = new GregorianCalendar();
	    
		// the date and weekday taht is 100 days from today
		today.add(Calendar.DAY_OF_MONTH, 100);
		int day = today.get(Calendar.DAY_OF_MONTH);
		int month = today.get(Calendar.MONTH);
        int year = today.get(Calendar.YEAR);
        
		int weekDay = today.get(Calendar.DAY_OF_WEEK);
		
		String weekDay_s = null;
		if (weekDay == 1) {weekDay_s = "Sunday";}
		if (weekDay == 2) {weekDay_s = "Monday";}
		if (weekDay == 3) {weekDay_s = "Tuesday";}
		if (weekDay == 4) {weekDay_s = "Wednesday";}
		if (weekDay == 5) {weekDay_s = "Thursday";}
		if (weekDay == 6) {weekDay_s = "Friday";}
		if (weekDay == 7) {weekDay_s = "Sunday";}
		
		
		System.out.print("The date and weekday that is 100 days from today: " + year + "-" + month + "-" + day + ", " + weekDay_s);
        System.out.println();
        
        // The weekday of your birthday
        GregorianCalendar myBirthday = new GregorianCalendar(1994, Calendar.MARCH, 8);
        weekDay = myBirthday.get(Calendar.DAY_OF_WEEK);
        if (weekDay == 1) {weekDay_s = "Sunday";}
		if (weekDay == 2) {weekDay_s = "Monday";}
		if (weekDay == 3) {weekDay_s = "Tuesday";}
		if (weekDay == 4) {weekDay_s = "Wednesday";}
		if (weekDay == 5) {weekDay_s = "Thursday";}
		if (weekDay == 6) {weekDay_s = "Friday";}
		if (weekDay == 7) {weekDay_s = "Sunday";}
        
        System.out.print("The weekday of my birthday: " + weekDay_s);
        System.out.println();
        
        // The date that is 10,000 days from your birthday
        myBirthday.add(Calendar.DAY_OF_MONTH, 10000);
        day = myBirthday.get(Calendar.DAY_OF_MONTH);
        month = myBirthday.get(Calendar.MONTH);
        year = myBirthday.get(Calendar.YEAR);
        
        System.out.print("The date that is 10,000 days from my birthday: " + year + "-" + month + "-" + day);
        
        
	}

}
