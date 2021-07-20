package com.mphasis.cui;
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

    public static void main(String[] args) {
	// write your code here
       // int vCPU=Runtime.getRuntime().availableProcessors();
        Point<Integer> point=new Point(3,6);
        System.out.println(point);
        Point<Float> point2=new Point(2.2f,4.4f);
        System.out.println(point2);
    }
}
