// Write a Java method to compute the average of three numbers..

import java.util.Scanner;

public class Que1 {
    public static double average(double a , double b, double c){
        return (a+b+c)/3;       // (double / int)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        double a = sc.nextDouble();

        System.out.print("Enter 2nd No: ");
        double b = sc.nextDouble();

        System.out.print("Enter 3rd No: ");
        double c = sc.nextDouble();

        System.out.println(average(a, b, c));
        // System.out.printf("%.2f",average(a, b, c));          // use printf(formatting) => to print only 2 digits after decimal
    }
}
