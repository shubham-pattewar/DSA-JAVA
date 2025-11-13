public class Que5 {
    public static int sumOfDigits(int n){
        int sum = 0;
        int rem = 0;

        while (n > 0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(153));
        System.out.println(sumOfDigits(153145));
    }
}
