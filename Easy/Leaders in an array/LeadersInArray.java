class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max) list.add(arr[i]);
            max=arr[i]>max?arr[i]:max;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=list.size()-1;j>=0;j--){
            ans.add(list.get(j));
        }
        return ans;
    }
}