public class Que3 {
    public static boolean Palindrome(int n){
        int og = n;
        int rev = 0;
        int rem = 0;
        while(n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(og == rev){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(Palindrome(121));
        System.out.println(Palindrome(122));
    }
}
