public class AMaxSubArray {
    public static int maxSubarraySum(int numbers[]){
        int maximum = Integer.MIN_VALUE;        // maximum sum 
        int sum = 0;        // current sum
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                sum = 0;
                for(int k = i; k <= j; k++){
                    //find sum of subarray
                    sum = sum + numbers[k];
                    System.out.print(sum + "  ");
                }
                if(sum > maximum){
                    maximum = sum;
                }
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        int ans = maxSubarraySum(numbers);

        System.out.print("\nMax Subarray Sum: " + ans);
    }
}
