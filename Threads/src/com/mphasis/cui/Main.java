package com.mphasis.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread mainThread=Thread.currentThread();
        System.out.println(mainThread);
        Thread thread1=new Thread();
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println((thread1.getState()));
        try{
            Thread.sleep(3000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(thread1.getState());
        System.out.println("End");
    }

}
