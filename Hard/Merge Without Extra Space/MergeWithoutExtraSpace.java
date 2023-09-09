class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        long temp[] = new long[n+m];
        int t=0;
        for(int i= 0;i<n;i++)
            temp[t++]=arr1[i];
        for(int i=0;i<m;i++)
            temp[t++]=arr2[i];
        
        Arrays.sort(temp);
        int tnew=0;
        for(int i=0;i<n;i++)
            arr1[i]=temp[tnew++];
        for(int i=0;i<m;i++)
            arr2[i]=temp[tnew++];
    }
}