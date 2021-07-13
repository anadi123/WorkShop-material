package com.mphasis.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread mainThread=Thread.currentThread();
        System.out.println(mainThread);
        try {
            mainThread.sleep(5000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
