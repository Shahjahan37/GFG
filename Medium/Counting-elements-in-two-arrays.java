class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> list = new ArrayList<>();
       Arrays.sort(arr2);
       
       for(int i=0; i<m; i++){
           
           list.add(binarySearch(arr1[i], arr2, n));
       }
       return list;
    }
    
    private static int binarySearch(int k, int[] arr, int n) {
        // code here
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            int mid = start+(end-start)/2;
            
            if(arr[mid] <= k) start = mid+1;
            
            else end = mid-1;
        }
        
        return start;
    }
}