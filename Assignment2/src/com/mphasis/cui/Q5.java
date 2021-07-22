package com.mphasis.cui;
// Handle an exception and move on.
import java.util.Random;


public class Q5 { //class HandleException
  public static void main(String[] args) {
    int a=0, b=0, c=0;
    Random r = new Random();

    for(int i=0; i<32000; i++) {
      
        b = r.nextInt();
        c = r.nextInt();
        a = 12345 / (b/c);
      
        a = 0; // set a to zero and continue
      
      System.out.println("a: " + a);
    }
  }
}

