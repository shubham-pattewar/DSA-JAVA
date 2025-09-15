import java.util.Scanner;

public class EIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float tax;

        System.out.print("Enter Income: ");
        float income = sc.nextFloat();

        if(income < 500000){
            tax = 0;
            System.out.println("Tax: " + tax);
        }
        else if (income >= 500000 && income < 1000000 ){
            tax = income * 0.2f;
            System.out.println("Tax: " + tax);
        }
        else {
            tax = income * 0.3f;
            System.out.println("Tax: " + tax);
        }
    }
}
