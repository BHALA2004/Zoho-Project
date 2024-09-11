package com.zoho.date;

public class DateMain {
    public static void main(String[] args) {
        DateModel dateModel = new DateModel(22, 06, 2023);
        System.out.println(dateModel.toString());
        DateImplementation dateImplementation = new DateImplementation();
        System.out.println("Day Belongs to Date : "+dateImplementation.weekChart(dateImplementation.getDay(dateModel)));
        dateImplementation.generateFullMonthCalendar(dateModel);

    }
}
