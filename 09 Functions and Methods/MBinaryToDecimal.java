public class MBinaryToDecimal {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        
        while(myNum > 0){
            int lastDigit = myNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            myNum = myNum/10;
        }
        System.out.println("decimal of " + binNum + " is: " + decNum);
    }
    public static void main(String[] args) {
        binToDec(1000);
        binToDec(1011);
    }
}
