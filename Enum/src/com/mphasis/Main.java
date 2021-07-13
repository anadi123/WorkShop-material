package com.mphasis;

import com.mphasis.types.Apple;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Apple apple;
        apple= Apple.GOLDEN_DEL;
        System.out.println(apple);
        Apple[] apples=Apple.values();
        for(Apple ap:apples){
            System.out.println(ap.getPrice());
        }
    }
}
