// Question 3: Enter cost of 3 items from the user (using float data type) -a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try addin 18% gst tax to the items the bill as an advanced problem)
import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pencil Price: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter Pen Price: ");
        float pen = sc.nextFloat();

        System.out.print("Enter Eraser Price: ");
        float eraser = sc.nextFloat();

        float cost = pencil + pen + eraser;
        System.out.println("Total Cost = " + cost);

        float gst = 1.18f * cost;
        System.out.println("Price after GST: " + gst);

        // you might get closest answer due to floating-point precision issue
        // for exact answer you can use double
        // for Ex. instead of ans = 118 when cost is 100 you will get ans = 117.99999
    }
}
