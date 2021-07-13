package com.mphasis;

import java.util.Objects;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day) {
        this.day = day;
    }

    public Date() {

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month){
        if(month>0 && month>13){
            this.month=month;

        }
        else
        {
            System.out.println("Invalid month");
        }
    }
    public String toString(){
        return
                day + "/"
                + month
                +"/" +year;

    }
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public static void main(String[] args) {
	// write your code here
        Date date=new Date();
        System.out.println(date);
        Object object=new Date(14,12,2021);
                System.out.println(date);
    }
}
