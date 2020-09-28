package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {

        GregorianCalendar myCal = new GregorianCalendar();

        System.out.println("The current date is: " + myCal.get(Calendar.MONTH) + " / " + myCal.get(Calendar.DATE)+" / "+ myCal.get(Calendar.YEAR));

        myCal.add(Calendar.DAY_OF_MONTH, 100);
        System.out.println("The new current date is: " + myCal.get(Calendar.MONTH) + " / " + myCal.get(Calendar.DATE)+" / "+ myCal.get(Calendar.YEAR));

        GregorianCalendar SandroBday = new GregorianCalendar(2020, Calendar.JANUARY, 13);
        System.out.println(SandroBday.get(Calendar.DAY_OF_WEEK));
        System.out.println("Your birthday is on a Monday");

        SandroBday.add(Calendar.DAY_OF_YEAR,10000);
        System.out.println("The new new date, 10000 days after my birthday, is: " + SandroBday.get(Calendar.MONTH) + " / " + SandroBday.get(Calendar.DATE)+" / "+ SandroBday.get(Calendar.YEAR));



        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.



    }

}