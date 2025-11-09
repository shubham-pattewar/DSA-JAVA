import java.util.*;

public class BFunctionWithParameters {
    public static int calculateSum(int num1, int num2){ // parameters or formal parameters
        int add = num1 + num2;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);        // arguments / actual parameters
        System.out.println(sum);
    }
}
