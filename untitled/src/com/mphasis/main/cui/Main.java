package com.mphasis.main.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][]nums;
        nums=new int[5][3];
        nums[1][2]=9;
        nums[3][2]=4;
        for(int[] value:nums){
            System.out.println(value);
        }
        System.out.println(nums.length);
    }
}
