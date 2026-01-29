import java.util.*;

public class EInbuiltSort2 {
    public static void printArr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,3,2,1};     //it will not work on primitive data types

        Integer arr[] = {1,4,5,2,3};     //reverseOrder() will work on Objects

        // Arrays.sort(arr, Collections.reverseOrder());

        Arrays.sort(arr,0,3, Collections.reverseOrder());

        
        printArr(arr);
    }
}
