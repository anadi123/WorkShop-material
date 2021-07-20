package com.mphasis.cui;




import java.util.concurrent.*;
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
public class Main {
    static Logger logger;


    static {
        logger= Logger.getLogger(Process.class.getName());
    }

    /*class static void process(CompletableFuture<Integer> completableFuture){
    logger.log(Level.INFO,Thread.currentThread().toString());
    logger.log(Level.INFO,"Begin Thread");
    completableFuture.thenAccept((data)-> System.out.println(Thread.currentThread().toString()+ "Data" +data));
    logger.log(Level.INFO,"End Process");
    }
    */

    private static CompletableFuture<Integer> create(){
        return CompletableFuture.supplyAsync(()->compute());
    }
    private static int compute(){
        logger.log(Level.INFO,"Inside compute >>>" +Thread.currentThread());
        return 2;
    }
    public static void print(Object data){
        logger.log(Level.INFO,Thread.currentThread()+ ">>>> " + data.toString());
    }


    public static void main(String[] args) {
        // write your code here

//        CompletableFuture<Integer> completableFuture = new CompletableFuture<Integer>();
//        logger.log(Level.INFO,Thread.currentThread().toString());
//        process(completableFuture);
//
//        completableFuture.complete(2);

        logger.log(Level.INFO,"Begin main" + Thread.currentThread());
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Phaser phaser =new Phaser(3);
        create().thenAccept(data-> print(data));

        executor.submit(new DependentService(phaser,300,"Task1"));
        executor.submit(new DependentService(phaser,300,"Task2"));
        executor.submit(new DependentService(phaser,300,"Task3"));
        phaser.arriveAndAwaitAdvance();

        logger.log(Level.INFO,"End Of main");

    }
    static  class DependentService implements Runnable {
        Phaser phaser;
        int duration;
        String name;

        public  DependentService(Phaser phaser,int duration,String name){
            this.phaser=phaser;
            this.duration=duration;
            this.name= name;
        }
        @Override
        public void run(){
            logger.log(Level.INFO,name);

            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            phaser.arriveAndAwaitAdvance();
        }


    }

}