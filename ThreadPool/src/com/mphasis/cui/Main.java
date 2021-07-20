package com.mphasis.cui;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread());
    }

}
public class Main {

    public static void main(String[] args) {
	// write your code here
        int vCore=Runtime.getRuntime().availableProcessors();
        ExecutorService executor= Executors.newFixedThreadPool(vCore);
        for(int c=0;c<10;c++){
            executor.execute(new Task());

        }
        executor.shutdown();
    }
}
