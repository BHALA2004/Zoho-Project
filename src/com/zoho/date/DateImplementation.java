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


    public String  getDay(DateModel dateModel){
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
        if(dateModel.getYear()%4==0 && (dateModel.getMonth()==1 || dateModel.getMonth()==2)){
            gettingDay-=1;
            if(gettingDay==-1){
                return "Saturday";
            }
            else {
                return weekChart(gettingDay);
            }
        }
        else {
            return weekChart(gettingDay);
        }

    }


}
