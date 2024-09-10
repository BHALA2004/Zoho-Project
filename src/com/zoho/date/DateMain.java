package com.zoho.date;

public class DateMain {
    public static void main(String[] args) {
        DateModel dateModel = new DateModel(23, 01, 2025);
        System.out.println(dateModel.toString());
        DateImplementation dateImplementation = new DateImplementation();
        String DateValue  = dateImplementation.getDay(dateModel);
        System.out.println("Day Belongs to Date :"+" "+DateValue);
    }
}
