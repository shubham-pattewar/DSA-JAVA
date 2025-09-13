import java.util.*;

public class LTypeConversion {
    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b);

        // long a = 25;
        // int b = a;          // Error: conversion from long to int
        // System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat();        // Error: error: incompatible types: possible lossy conversion from float to int
        // System.out.println(number);

    }
}
