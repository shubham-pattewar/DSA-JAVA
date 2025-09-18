// Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;

        System.out.print("Enter the Number of Integers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();

            if(num % 2 == 0){
                sum1 = sum1 + num;
            } else{
                sum2 = sum2 + num;
            }
        }
        System.out.println("Even Sum: " + sum1);
        System.out.println("Odd Sum: " + sum2);
    }
}
