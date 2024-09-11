package com.zoho.date;

public class DateImplementation {

    public int monthChart(int month){
        int monthChartValue = 0;
        switch (month){
            case 1:
                monthChartValue=0;break;
            case 2:
                monthChartValue=3;break;
            case 3:
                monthChartValue=3;break;
            case 4:
                monthChartValue=6;break;
            case 5:
                monthChartValue=1;break;
            case 6:
                monthChartValue=4;break;
            case 7:
                monthChartValue=6;break;
            case 8:
                monthChartValue=2;break;
            case 9:
                monthChartValue=5;break;
            case 10:
                monthChartValue=0;break;
            case 11:
                monthChartValue=3;break;
            case 12:
                monthChartValue=5;break;
        }
        return monthChartValue;
    }

    public int centuryChart(int year){
        int centuaryChartValue = 0;
        if(year>=1400 && year<=1499 || year>=1800 && year<=1899 || year>=2200 && year<=2299){
            centuaryChartValue=2;
        }
        else if(year>=1500 && year<=1599 || year>=1900 && year<=1999 || year>=2300 && year<=2399){
            centuaryChartValue=0;
        }
        else if(year>=1600 && year<=1699 || year>=2000 && year<=2099 || year>=2400 && year<=2499){
            centuaryChartValue=6;
        }
        else if(year>=1700 && year<=1799 || year>=2100 && year<=2199 || year>=2500 && year<=2599){
            centuaryChartValue=4;
        }
        return centuaryChartValue;
    }

    public String weekChart(int date){
        String weekChartValue = null ;
        switch (date){
            case 0:
                weekChartValue="Sunday";break;
            case 1:
                weekChartValue="Monday";break;
            case 2:
                weekChartValue="Tuesday";break;
            case 3:
                weekChartValue="Wednesday";break;
            case 4:
                weekChartValue="Thursday";break;
            case 5:
                weekChartValue="Friday";break;
            case 6:
                weekChartValue="Saturday";break;
        }
        return weekChartValue;
    }


    public void generateFullMonthCalendar(DateModel dateModel) {
        int month = dateModel.getMonth();
        int year = dateModel.getYear();
        int lastDayOfMonth = lastDayOfMonth(1, month, year);


        dateModel.setDate(1);
        int startDay = getDay(dateModel);


        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};


        System.out.println(String.join(" ", daysOfWeek));


        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }


        int dayIndex = startDay;
        for (int i = 1; i <= lastDayOfMonth; i++) {
            System.out.printf("%-4d", i);
            dayIndex++;
            if (dayIndex == 7) {
                dayIndex = 0;
                System.out.println();
            }
        }
        System.out.println();
    }




    public int  getDay(DateModel dateModel){
        int Day = 0;
        int dateValue = dateModel.getDate();

        int monthValue = monthChart(dateModel.getMonth());
        int centuryValue = centuryChart(dateModel.getYear());
        String yearmodify = String.valueOf(dateModel.getYear());
        String newYearModify = yearmodify.substring(2,4);
        int yearValue = Integer.parseInt(newYearModify);
        int yearQuotientValue = yearValue/4;
        Day+=dateValue+monthValue+centuryValue+yearValue+yearQuotientValue;
        int gettingDay = Day%7;
        if (isLeapyear(dateModel.getYear()) && (dateModel.getMonth() == 1 || dateModel.getMonth() == 2)) {
            gettingDay--;
            if (gettingDay == -1) {
                gettingDay = 6;
            }
        }
        return gettingDay;

    }

    public boolean isLeapyear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        return false;
    }

    public int lastDayOfMonth(int day,int month,int year){
        if(month==1){
            return 31;
        } else if (month==2) {
            if(isLeapyear(year)){
                return 29;
            }
            else {
                return 28;
            }

        } else if (month==3) {
            return 31;

        }
        else if (month==4) {
            return 30;

        }
        else if (month==5) {
            return 31;

        }
        else if (month==6) {
            return 30;

        }
        else if (month==7) {
            return 31;

        }
        else if (month==8) {
            return 31;
            }
        else if (month==9) {
            return 30;
        }
        else if (month==10) {
            return 31;
        }
        else if (month==11) {
            return 30;
        }
        else {
            return 31;
        }


    }


}
