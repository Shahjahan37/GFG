
class MaxMin
{ 
    public static int findSum(int a[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            min = Math.min(min, a[i]);
            max = Math.max(max , a[i]);
        }
        int sum = min  + max;
        return sum;
    }
}