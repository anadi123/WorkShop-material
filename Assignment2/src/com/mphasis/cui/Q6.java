package com.mphasis.cui;
import java.lang.ArithmeticException;
public class Q6 { //class SuperSubCatch
    public static void main(String args[]) {
    try {
        int a = 0;
        int b = 42 / a;
    } catch(Exception e) {
        System.out.println("Generic Exception catch.");
    } catch(ArithmeticException e) { // ERROR - unreachable
            System.out.println("This is never reached.");
        }

    }
}
}

