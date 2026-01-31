// Write a program to Find Transpose of a Matrix.
// What is Transpose? Transpose of a matrix is the process ofswapping therows to columns. 
// For a 2x3 matrix, 
// Matrix   a11 a12 a13
//          a21 a22 a23
// Transposed Matrix    a11 a21 
//                      a12 a22
//                      a13 a23

public class Que3 {
    public static void main(String[] args) {
        String[][] mat = {{"a11","a12","a13"},{"a21","a22","a23"}};
        
        for(int i = 0; i < mat[0].length; i++){
            for(int j = 0; j < mat.length; j++){
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
