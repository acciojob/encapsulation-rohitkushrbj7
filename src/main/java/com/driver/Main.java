package com.driver;

public class Main {
    public static void main(String [] args){
        RWOnly obj = new RWOnly();


        // Trying to access private member directly (will cause compile-time error)
        // obj.name = "John"; // This will cause a compile-time error because name is private

        // Trying to print private member directly (will cause compile-time error)
        // System.out.println(obj.name); // This will cause a compile-time error

        // Task 6: Using setter and getter
        obj.setName("John");
        System.out.println(obj.getName()); // This will print "John"
    }
  
}