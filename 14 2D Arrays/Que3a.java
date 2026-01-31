// Write a program to Find Transpose of a Matrix.
// What is Transpose? Transpose of a matrix is the process ofswapping therows to columns. 
// For a 2x3 matrix, 
// Matrix   a11 a12 a13
//          a21 a22 a23
// Transposed Matrix    a11 a21 
//                      a12 a22
//                      a13 a23

public class Que3a {
    public static void printMatrix(int[][] matrix){
        System.out.println("The matrix is: ");
        for(int i=0;i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 2, cols = 3;
        int[][] matrix = {{2,3,7},{5,6,7}};

        printMatrix(matrix);

        int[][] transpose = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        
        printMatrix(transpose);
    }
}
