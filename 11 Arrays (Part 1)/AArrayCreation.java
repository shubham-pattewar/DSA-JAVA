import java.util.*;

public class AArrayCreation {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks: ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("Output: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);

        System.out.println("Percentage: ");
        int percentage = (marks[0] + marks[1])/2;
        System.out.println(percentage);

        System.out.println("Length of array: ");
        System.out.println(marks.length);
        sc.close();
    }
}
