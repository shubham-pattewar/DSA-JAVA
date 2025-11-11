public class JPrime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        // boolean isPrime;        // error at the return statement: The local variable isPrime may not have been initialized

        for (int i = 2; i < n ; i++){
            if(n % i == 0){
                isPrime = false;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}
