public class EDataTypes {
    public static void main(String[] args) {
        byte by = 8;
        System.out.println(by);

        byte a = 100;        // valid
        byte b = -128;       // lowest possible value
        byte c = 127;        // highest possible value
        // byte d = 130;     // Compile-time error: out of range

        byte x = 10;
        byte y = 20;
        // byte z = x + y; // error: int cannot be converted to byte
        int z = x + y;      // result converted to int
        System.out.println(z);
        
        
        char ch = 'a';
        System.out.println(ch);
        // char ch2 = 'ab';  // error(can store only single char)

        boolean var1 = true;
        boolean var2 = false;

        // float price = 10.5;      // error(cant convert from double to float)
        float price1 = 10.5f; 
        float price2 = 10.87F; 
        float price3 = (float) 8.77; 
        // System.out.println(price1 , price2 , price3);       // error
        System.out.println(price1);
        System.out.println(price2);
        System.out.println(price3);
        
        long p = 5534985;
        System.out.println(p);

        double q = 75.4356365635;
        double r = 75435636563.5;
        double s = 87;
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);

        short n = 434;
        System.out.println(n);
    }
}
