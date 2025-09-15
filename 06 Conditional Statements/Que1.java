// Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n > 0){
            System.out.println("Positive Number");
        } else if(n == 0){
            System.out.println("Zero");
        } else {
            System.out.println("Negative Number");
        }

        sc.close();
    }
}
