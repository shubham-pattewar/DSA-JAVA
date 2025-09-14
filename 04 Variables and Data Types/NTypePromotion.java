public class NTypePromotion {
    public static void main(String[] args) {
        // Example 1:
        // char a = 'a';
        // char b = 'b';
        // // char c = a - b;      // Error: you cant convert integer to character
        // System.out.println(a+b);
        // System.out.println(a-b);

        // System.out.println((int)(a));
        // System.out.println((int)('&'));


        // Example 2:
        // short x = 25;
        // byte y = 25;
        // char z = 'c';
        // // byte bt = x + y + z;     // Error: lossy conversion from int to byt
        // byte bt = (byte) (x + y + z);
        // System.out.println(bt);


        // Example 3:
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30; 
        // int ans = a + b + c + d;     // Error: lossy conversion from double to int
        double ans = a + b + c + d;     // ans will be in double
        System.out.println(ans);    
        
        
        // Example 4:
        byte x = 5;
        // byte y = x * 2;      // Error
        byte y = (byte) (x * 2);    // Converting int(which was Type Promoted from byte) into byte
        System.out.println(y);
    }
}
