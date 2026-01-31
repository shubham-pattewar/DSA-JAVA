public class DDiagonalSum2 {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;

        // BruteForce Method(O(n2))
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){                 // Primary Diagonal
                    sum += matrix[i][j];
                } else if( i+j == n-1){     // Secondary Diagonal
                    sum += matrix[i][j];
                }
            }
        }

        //no need to write n = odd condition(because either if will work or either else if will work)    
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
