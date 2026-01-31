public class EDiagonalSum3 {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;

        // Optimised Method
        for(int i = 0; i < n; i++){
            sum += matrix[i][i];        //primary

            if(i != n-i-1)                  // overlapping condition(if n == odd)
                sum += matrix[i][n-i-1];    //secondary           
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
