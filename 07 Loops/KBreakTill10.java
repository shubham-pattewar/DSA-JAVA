import java.util.Scanner;

public class KBreakTill10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter No: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("Out of Loop");
        
        sc.close();
    }
}
