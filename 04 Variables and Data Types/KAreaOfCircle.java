import java.util.*;

public class KAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        float rad = sc.nextFloat();

        // float area = 3.14 * rad * rad;      // Type mismatch: cannot convert from double to float

        float area = 3.14f * rad * rad;
        System.out.println("Area: " + area);
    }
}
