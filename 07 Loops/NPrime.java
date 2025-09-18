import java.util.*;

public class NPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        String result = (isPrime == true) ? "Prime": "Not Prime";
        System.out.println(result);
    }
}
