import java.util.*;         //this is a package

public class HInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Word: ");
        String input = sc.next();       // just stores 1st word(until white spaces)
        System.out.println(input);

        sc.nextLine();      // consume the leftover newline()

        System.out.print("Enter a Line: ");
        String name = sc.nextLine();    // consumes whole line
        System.out.println(name);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();          // If input is other than number => Exception Occurs
        System.out.println(number);

        System.out.print("Enter a Float: ");
        float price = sc.nextFloat();       // it may take integer as input also
        System.out.println(price);
    }
}
