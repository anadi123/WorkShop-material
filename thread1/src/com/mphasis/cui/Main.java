package com.mphasis.cui;

class Task implements Runnable{

    @Override
    public void run() {
        Thread curThread=Thread.currentThread();
        for (int i=0;i<10;i++){
            System.out.println(curThread+String.valueOf(i));
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread mainThread=Thread.currentThread();
        System.out.println(mainThread);
//        Thread thread1=new Thread();
//        System.out.println(thread1.getState());
//        thread1.start();
//        System.out.println(thread1.getState());
//        try {
//            mainThread.sleep(5000);
//
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
        Task task=new Task();
        Thread thread1=new Thread(task,"thread1");
        Thread thread2=new Thread(task,"Thread2");
        System.out.println(thread1.getState());
        thread1.start();
        thread2.start();
        System.out.println(thread2.getState());
        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End");
    }

}
