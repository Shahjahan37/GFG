
class secondLargest {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int secondLargest = -1;
        for(int i=n-1; i>0; i--){
            if(arr[i] != arr[i-1]){
               secondLargest = arr[i-1]; 
               break;
            }
        }
        return secondLargest;
    }
}