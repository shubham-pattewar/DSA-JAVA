
public class CDiagonalSum {
    public static void diagonalSum(int matrix[][]){
        int n = matrix.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + matrix[0][i];
        }
        for(int i = n-1; i >= 0; i--){
            sum = sum + matrix[0][i];
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {  {1, 2, 3, 4}, 
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}
                         };
        diagonalSum(matrix);
    }
}
