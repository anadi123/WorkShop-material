package com.mphasis.cui;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger;
    static {
        logger=Logger.getLogger(Main.class.getName());
    }
    public static void main(String[] args) {
	// write your code here
        ArrayList result=new ArrayList();
        result.add("A");
        result.add("T");
        result.add("G");
        result.add("T");
        result.add("U");
        result.add("V");
        String element=(String) result.get(0);
        for(Object elements:result){
         logger.log(Level.INFO, element);
        }
    }
}
