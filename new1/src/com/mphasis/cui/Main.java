package com.mphasis.cui;

interface Printer{
    public void print(String str);
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Printer printer = (name) -> System.out.println(name);
        printer.print("Bharat");
        Printer print3=System.out::println;
        print3.print("Bharat");
        execute((name)->System.out.println(name),"Bharat");
        execute((str)->System.out.println((str)));
        execute(System.out::println,"Bharat");
    }


//    public static void execute(Printer printer,String name){
//        printer.print(name);
//
//    }
    public static void execute(Printer printer){
        printer.print("Bharat");
    }
    public static void execute(Printer printer,String country){
        printer.print(country);

    }
}
