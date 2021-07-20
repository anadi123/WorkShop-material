package com.mphasis.cui;

import sun.rmi.runtime.Log;

import java.util.concurrent.CompletableFuture;
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
        logger=Logger.getLogger(Main.class.getName());
    }
    public static void process(CompletableFuture<Integer> completableFuture){
        logger.log(Level.INFO,"Begin process");
        completableFuture.thenAccept((data)->System.out.println("Data"+ data));
        logger.log(Level.INFO,"End process");
    }
    public static void main(String[] args) {
	// write your code here
        CompletableFuture<Integer> completableFuture=new CompletableFuture<Integer>();
        process(completableFuture);
        Logger.getLogger(Main.class.getName()).log(Level.INFO,"End of main");
    }
}
