package com.mphasis.main.cui;

public class Main3 {
    int num2;
    public void display(){
        System.out.println(num2);
    }
    public static void main(String[] args)
    {
        int num1;
        Main3 main1=new Main3();
        Main3 main2=new Main3();
        main1.num2=2;
        main2.num2=4;
        Main3.num2=8;
        System.out.println(main1.num2);
        System.out.println(main2.num2);
      //  int num3;
        System.out.println("End");
    }
}
