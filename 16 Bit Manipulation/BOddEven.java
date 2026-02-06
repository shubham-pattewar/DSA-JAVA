public class BOddEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){             // brackets are important
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(14);
        oddOrEven(212);
    }
}
