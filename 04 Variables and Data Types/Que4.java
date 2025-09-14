// Find Output: 

public class Que4 {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result1 = (f * b) + (i * c) - (d * s);
        double result2 = f + b + i + c + d + s;

        System.out.println(result1);
        System.out.println(result2);
    }  
}
