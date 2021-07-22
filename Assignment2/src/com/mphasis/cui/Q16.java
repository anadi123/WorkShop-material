package com.mphasis.cui;
class Box1 { //class Box
    double width;
    double height;
    double depth;
  
    Box1(double w, double h, double d) {
      width = w;
      height = h;
      depth = d;
    }
  
   
  }
  
  class Q16 { //class toStringDemo
    public static void main(String args[]) {
      Box b = new Box(10, 12, 14);
      String s = "Box b: " + b; // concatenate Box object
  
      System.out.println(b); // convert Box to string
      System.out.println(s);
    }
  }
  