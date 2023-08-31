class EquilibriumPoint {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int leftsum=0,totalsum=0;
        for(int i=0; i<n; i++){
            totalsum+=arr[i];
        }
        for(int i=0; i<n; i++){
            if(leftsum==(totalsum-arr[i])){
                return i+1;
            }
            leftsum+=arr[i];
            totalsum-=arr[i];
        }
        return -1;
    }
}