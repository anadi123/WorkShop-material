package com.mphasis.cui;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
    @Override
    public void run(){

        System.out.println(Thread.currentThread());
        try {
            Thread.sleep(4000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
public class Main {

    public static void main(String[] args) {
        // write your code here
        int vCPU=Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService service= Executors.newScheduledThreadPool(vCPU);
        service.scheduleAtFixedRate(new Task(),5,2, TimeUnit.SECONDS);
        service.shutdown();
    }
}
