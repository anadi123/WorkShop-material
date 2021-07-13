package com.mphasis.cui;

class IllegalAgeException extends Exception{
    @Override
    public String getMessage(){
        return "Need to be 18 or above";
    }
}
class Vote{
    public void register(int age) throws IllegalAgeException{
        if(age<18){
            throw new IllegalAgeException();
        }
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            Integer.parseInt(String.valueOf(2));
            // new Vote().register(16);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("End");
        }
    }
}
