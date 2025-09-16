import java.util.*;

public class CPrint1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        while(counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
    } 
}
