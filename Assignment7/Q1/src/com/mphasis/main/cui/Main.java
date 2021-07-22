package com.mphasis.main.cui;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stream<String> nameStream= Stream.of("mohan","john","vaibhav","amit");
        Stream<String> nameStartJ = nameStream.map(String::toUpperCase)
                .peek(e-> System.out.println(e))
                .filter(s -> s.startsWith("J"));

        System.out.println("Calling terminal operation: count");
        long count = nameStartJ.count();
        System.out.println("count: "+ count);

     

    }
}
