// Demonstrate a type wrapper. 
package com.mphasis.cui;
class Q10 { //class Wrap
    public static void main(String args[]) { 
       
      Integer iOb = new Integer(100);  
   
      int i = iOb.intValue(); 
   
      System.out.println(i + " " + iOb); // displays 100 100 
    } 
  }