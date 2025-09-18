// What is wrong with the program

public class Que5 {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }
        // System.out.println("i after the loop = " + i);       // scope of i is within for loop itself
    }
}
