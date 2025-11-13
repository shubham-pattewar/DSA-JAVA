public class Que4 {
    public static void main(String[] args) {
        /*
            Math.min(x, y)
            → Input: int, long, float, double
            → Return: Same as input type

            Math.max(x, y)
            → Input: int, long, float, double
            → Return: Same as input type

            Math.sqrt(x)
            → Input: double
            → Return: double

            Math.pow(x, y)
            → Input: double, double
            → Return: double

            Math.abs(x)
            → Input: int, long, float, double
            → Return: Same as input type
        */

        System.out.println(Math.min(9,5));      //only two arguments allowed
        System.out.println(Math.max(5,9));
        System.out.println(Math.sqrt(35));
        System.out.println(Math.pow(4,8.2));

        System.out.println(Math.abs(-6));
        System.out.println(Math.abs(5.787));
        System.out.println(Math.abs(-6.99999));
    }
}
