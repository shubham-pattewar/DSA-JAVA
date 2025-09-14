public class BUnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;

        System.out.println(a);      // o/p: 11
        System.out.println(b);      // o/p: 11

        int x = 10;
        int y = x++;

        System.out.println(x);
        System.out.println(y);

        int m = 10;
        int n = --m;

        System.out.println(m);
        System.out.println(n);

        int p = 10;
        int q = p--;

        System.out.println(p);
        System.out.println(q);
    }
}
