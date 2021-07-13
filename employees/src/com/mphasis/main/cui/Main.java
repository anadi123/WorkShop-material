package com.mphasis.main.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HR hr=new HR();
        Finance finance=new Finance();
       // Employee employees=new Employee();
        Employee employees=hr.recruit('p');
        finance.processSalary(employees);
        employees=hr.recruit('i');
        finance.processSalary(employees);
        employees=hr.recruit('c');
        finance.processSalary(employees);

    }
}
