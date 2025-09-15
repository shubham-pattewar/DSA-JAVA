import java.util.Scanner;

public class JCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st digit: ");
        int a = sc.nextInt();
        System.out.print("Enter 2st digit: ");
        int b = sc.nextInt();

        System.out.print("Enter Operator: ");
        char opr = sc.next().charAt(0);

        switch(opr){
            case '+': System.out.println(a+b);
                      break;
            case '-': System.out.println(a-b);
                      break;
            case '*': System.out.println(a*b);
                      break;
            case '/': System.out.println(a/b);
                      break;
            case '%': System.out.println(a%b);
                      break;
            default: System.out.println("Wrong Operator");
        }

    }
}
