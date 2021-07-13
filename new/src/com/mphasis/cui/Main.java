package com.mphasis.cui;
interface Printer{
    public void print(String str);
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        new Printer(){
            @Override
            public void print(String str){
                System.out.println(str);
            }
        }.print("Bharat");
    }
}
