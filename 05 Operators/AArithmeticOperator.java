public class AArithmeticOperator {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        // System.out.println("add = " + A+B);      // o/p: add = 105

        System.out.println("add = " + (A+B));       // bracket is important
        System.out.println("sub = " + (A-B));
        System.out.println("multi = " + (A*B));
        System.out.println("divide = " + (A/B));
        System.out.println("modulo = " + (A%B));

        System.out.println("modulo1 = " + (12 % 5));
        System.out.println("modulo2 = " + (1 % 6));
    }
}
