import java.util.Scanner;

public class DSumOfNNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        while(i <= n){
            sum = sum + i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}
