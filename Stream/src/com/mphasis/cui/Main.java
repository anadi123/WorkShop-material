package com.mphasis.cui;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // write your code here
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        numbers.stream()
//                .forEach(System.out::println);
//        numbers.stream()
//                .map(numbers->numbers+1)
//                .forEach(System.out::println);
//        numbers.stream()
//                .map(String::valueOf)
//                .map(number->number+1)
//                .forEach(System.out::println);
//        numbers.stream()
//                .map(String::valueOf)
//                .mapToInt(number->Integer.valueOf(number)+2)
//                .forEach(System.out::println);
        //            System.out.println(numbers.stream()
        //                    .reduce(0,(total,number)->Integer.sum(total,number)));
//        HashSet<String> result=new HashSet<String>();
//        result.add("Raj");
//        result.add("Anil");
//        result.add("Madhurima");
//        }
        numbers.parallelStream()
                .forEach(Main::print);
        (int value){
            System.out.print(Thread.currentThread()+">>>>>>"+value);
        }
    }
}
