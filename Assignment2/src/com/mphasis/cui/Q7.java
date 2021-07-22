package com.mphasis.cui;
import java.lang.IllegalAccessException;
class Q7 { //class ThrowsDemo
    static void throwOne() {
      System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
      throwOne();
    }
  }
