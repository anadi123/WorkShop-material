package com.mphasis.cui;
class Arithmetic{
    public int sum(int num1,int num2){
        return num1+num2;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Begin");
        assert (new Arithmetic().sum(2,4)==6);
        System.out.println("End");
    }
}
