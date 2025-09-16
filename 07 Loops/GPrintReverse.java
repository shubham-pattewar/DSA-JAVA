public class GPrintReverse {
    public static void main(String[] args) {
        int n = 235644;
        int m;
        int p = 0;

        while(n > 0){
            m = n%10;
            p = p*10 + m;
            n= n/10;
        }
        System.out.println(p);
    }
}