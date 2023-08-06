

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxSum = Integer.MIN_VALUE;  // Initialize the maximum sum to the smallest possible value
        long currentSum = 0;  // Initialize the current sum to 0

        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        
    }
    
}