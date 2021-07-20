package com.mphasis.cui;
public class Q1{
    public static  void main(String[] args){
        double lightSpeed;
        double days;
        double seconds;
        double distance;

        lightSpeed=186000;
        days=1000;
        seconds=days*24*60*60;
        distance=lightSpeed*seconds;
        System.out.println("in" + days);
        System.out.println("days light will travel about");
        System.out.println(distance + "miles");
    }
}
//public class Q1 {
//
//}
