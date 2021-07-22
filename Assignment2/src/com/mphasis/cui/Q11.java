package com.mphasis.cui;
// Demonstrate a autoboxing/unboxing. 
class Q11{ //class AutoBox 
  public static void main(String args[]) { 
     
    Integer iOb = 100; // autobox an int 
 
    int i = iOb; // auto-unbox 
 
    System.out.println(i + " " + iOb);  // displays 100 100 
  } 
}
