package main.cui;

import com.mphasis.Date;

public class main {
    public static void main(String[] args){
        Date date=new Date(12,12,2021);
        System.out.println(date);
        date.setMonth(13);
        System.out.println(date);
        date.setMonth(11);
        System.out.println(date);
            String dob=date.toString();

        System.out.println(dob);
    }
}
