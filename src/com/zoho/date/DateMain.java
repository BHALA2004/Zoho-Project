package com.zoho.date;

import java.util.Scanner;

public class DateMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateImplementation dateImplementation = new DateImplementation();
        System.out.println("Enter Date in format(DD):");
        int date = scanner.nextInt();
        System.out.println("Enter Month in format(MM):");
        int month = scanner.nextInt();
        System.out.println("Enter Year in format(YYYY)");
        int year = scanner.nextInt();
        if(month>=1 && month<=12){
            if(date<=dateImplementation.lastDayOfMonth(date,month,year)){
                if(year>=1000 && year<=9999){

        DateModel dateModel = new DateModel(date,month,year);
        System.out.println(dateModel.toString());

        System.out.println("Day Belongs to Date : "+dateImplementation.weekChart(dateImplementation.getDay(dateModel)));
        dateImplementation.generateFullMonthCalendar(dateModel);}
            else {
                    System.out.println("Invalid Year");
                }
            }
        else {
                System.out.println("Date Not Present in Month");
            }
        }
        else {
            System.out.println("Invalid Month");
        }

    }
}
