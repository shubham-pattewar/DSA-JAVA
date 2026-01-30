import java.util.Scanner;

public class ACreation {
    // searching
    public static boolean search(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length; 

        for(int i = 0; i < n; i++){             
            for(int j = 0; j < m; j++){  
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }       
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[4][3];
        int n = matrix.length;          //rows
        int m = matrix[0].length;       //columns
        System.out.println(n);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++){             
            for(int j = 0; j < m; j++){         
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output:
        for(int i = 0; i < n; i++){             
            for(int j = 0; j < m; j++){   
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Max and Min
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){             
            for(int j = 0; j < m; j++){   
                maxi = Math.max(maxi, matrix[i][j]);
                mini = Math.min(mini, matrix[i][j]);
            }
        }

        System.out.println("Max: " + maxi);
        System.out.println("Min: " + mini);

        search(matrix, 5);
        sc.close();
    }
}
