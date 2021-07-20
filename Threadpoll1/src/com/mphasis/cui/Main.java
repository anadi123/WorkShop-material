package com.mphasis.cui;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

class Point<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public Point(T x, T y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "Point{" +
                "x=" +x+
                ",y=" +y+
                "}";

    }
}
class Task implements Runnable{
    CountDownLatch latch;
    int duration;
    public Task(CountDownLatch latch,int duration){
        this.latch=latch;
        this.duration=duration;
    }
    @Override
    public void run(){
        Logger logger=Logger.getLogger(Task.class.getName());
        logger.log(Level.INFO,Thread.currentThread()+ " Started...");
        try{
            latch.await();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
         latch.countDown();
      //logger.log("Resuming");
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
         int vCPU=Runtime.getRuntime().availableProcessors();
        ExecutorService service= Executors.newFixedThreadPool(vCPU);
        CountDownLatch latch=new CountDownLatch(3);
        service.execute(new Task(latch,2000));
        service.execute(new Task(latch,3000));
        service.execute(new Task(latch,4000));
        try{
            latch.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        service.shutdown();
        Logger.getLogger(Main.class.getName()).log(Level.INFO,"End of Main Thread");
    }
}
