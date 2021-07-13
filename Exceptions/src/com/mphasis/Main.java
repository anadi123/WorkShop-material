package com.mphasis;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println(args[0]+" "+ args[1]+ " "+ args[2]);
        try
        {
            System.out.println(Integer.parseInt(args[0])+ Integer.parseInt(args[1]));
            System.out.println("End of try block");
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException exception){
            System.out.println("Provide 2 numbers");
        }//catch(NumberFormatException exception){
           // System.out.println("Please provide valid numbers");
        catch(ArithmeticException exception){
            System.out.println("U can't divide by zero");
        }catch(Exception exception){
            System.out.println("Unknown exception"+ exception);
        }


        System.out.println("The End");

    }
}
