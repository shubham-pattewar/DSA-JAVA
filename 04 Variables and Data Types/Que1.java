// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
import java.util.*;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int A = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int B = sc.nextInt();
        
        System.out.print("Enter Third Number: ");
        int C = sc.nextInt();

        // float average = (A + B + C)/3;       // It will convert whole expression to int and store in float(some part of answer may loss)
        float average = (float) (A + B + C)/3;  // now you will get exact answer
        System.out.println("Average: " + average);
    }
}
