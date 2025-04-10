package org.example;


public class Main {
    public static void main(String[] args) {


        long bobSalary = 65000L;
        long garySalary = 76000L;
        long highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);


        long carPrice = 35000L;
        long truckPrice = 60000L;
        long lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);


        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);

    }
}
