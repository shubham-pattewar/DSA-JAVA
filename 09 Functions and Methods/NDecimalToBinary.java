public class NDecimalToBinary {

    public static int DecToBin(int n){
        int bin = 0;
        int rem = 0;
        int pow = 0;

        while(n > 0){
            rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
            n = n/2;
        }

        return bin;
    }
    public static void main(String[] args) {
        System.out.println(DecToBin(11));
    }
}
