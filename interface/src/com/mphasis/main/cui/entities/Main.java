package com.mphasis.main.cui.entities;
class Bird implements Flyer{
    @Override
    public void takeOff(){
        System.out.println("Bird takes off");

    }

    @Override
    public void fly(){
        System.out.println("Bird fly");
    }
    @Override
    public void land(){
        System.out.println("Bird lands");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
