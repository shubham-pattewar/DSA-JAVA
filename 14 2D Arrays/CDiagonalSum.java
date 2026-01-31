
public class CDiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;

        // Primary Diagonal
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i == j){
                    sum = sum + matrix[i][j];
                }
            }
        }

        // Secondary Diagonal
        for(int i = 0; i < matrix.length; i++){
            for(int j = matrix.length-1; j >= 0; j--){
                if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        //if n == Odd
        if(matrix.length % 2 != 0){
            sum = sum - matrix[n/2][n/2];
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {  {1, 2, 3, 4}, 
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}
                         };
        System.out.println("Sum: " + diagonalSum(matrix));
    }
}
