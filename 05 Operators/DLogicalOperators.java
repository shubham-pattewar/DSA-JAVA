public class DLogicalOperators {
    public static void main(String[] args) {
        // Logical AND
        System.out.println((3>2) && (5>0));
        System.out.println((3<2) && (5>0));
        System.out.println((3>2) && (5<0));
        System.out.println((3<2) && (5<0));

        // Logical OR
        System.out.println((3>2) || (5>0));
        System.out.println((3<2) || (5>0));
        System.out.println((3>2) || (5<0));
        System.out.println((3<2) || (5<0));

        // Logical NOT
        System.out.println(!(5>3));
        System.out.println(!(5<3));
        // System.out.println(!5);      // Error
    }
}
