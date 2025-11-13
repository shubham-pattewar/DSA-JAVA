public class AHollowRectangle {
    public static void hollow_rectangle(int totRows, int totCols){
        for (int i =1; i <= totRows; i++){
            for(int j = 1; j <= totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // for(int i= 0; i<4; i++){
        //     for(int j = 0; j < 5; j++){
        //         if( !(i>0 && i <3 && j >0 && j <4)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        hollow_rectangle(4, 5);
        hollow_rectangle(10, 7);
    }
}
