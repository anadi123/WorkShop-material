package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{

    private String name;
    private int age;
    private  List<String> listOfCities;

    public  Employee(String name,int age, List<String> listOfCities){
        super();
        this.name=name;
        this.age= age;
        this.listOfCities=listOfCities;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getListOfCities() {
        return listOfCities;
    }

    public void setListOfCities(List<String> listOfCities) {
        this.listOfCities = listOfCities;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "name=" + name +
                ", age=" + age +
                ']';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees= Main.getListOfEmployees();

        listOfEmployees.stream()

                .sorted(Comparator.comparingInt(Employee::getAge))
                .forEach(System.out::println);



    }
    public static  List<Employee> getListOfEmployees(){
        List<Employee> listOfEmployees = new ArrayList<>();
        Employee e1 = new Employee("Mohan",24, Arrays.asList("Newyork", "Banglore"));
        Employee e2= new Employee("John", 27,Arrays.asList("Paris","London"));
        Employee e3= new Employee("Vaibhav", 32,Arrays.asList("Pune","Seattle"));
        Employee e4= new Employee("Amit", 22,Arrays.asList("Chennai","Hyderabad"));


        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);

        return listOfEmployees;
    }
}
