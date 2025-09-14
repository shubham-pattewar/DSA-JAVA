import java.util.*;

public class MTypeCasting {
    public static void main(String[] args) {
        // float a = 25.0f;
        // int b = a;      // Error
        // System.out.println(b);

        float a = 25.99f;
        int b = (int) a;    // Explicit
        System.out.println(b);


        char ch = 'a';
        int number = ch;
        System.out.println(number);

        char ch2 = 'A';
        int number2 = ch2;
        System.out.println(number2);

        char ch3 = '1';
        int number3 = ch3;
        System.out.println(number3);

        char ch4 = '#';
        int number4 = ch4;
        System.out.println(number4);
    }
}
    