public class IHollowRhombus {
    // My Approach
    public static void SolidRhombus(int n){
        for(int i = 1; i <= n; i++){
            if(i == 1){
                for(int j = 1; j <= n-i; j++)
                    System.out.print(" ");
                for(int j = 1; j <= n; j++)
                    System.out.print("*");
            } else if(i == n){
                for(int j = 1; j <= n; j++)
                    System.out.print("*");
            } else {
                for(int j = 1; j <= n-i; j++)
                    System.out.print(" ");

                System.out.print("*");

                for(int j = 1; j <= n-2; j++)
                    System.out.print(" ");

                System.out.print("*");
            }  
            System.out.println();       
        }
    }
    public static void main(String[] args) {
        SolidRhombus(5);
    }
}
