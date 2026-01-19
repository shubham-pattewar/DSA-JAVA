import java.util.*;

public class DLargestInArray {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        int large = getLargest(arr);

        System.out.println("Largest: " + large);
        System.out.println("Final Answer");
    }
}
