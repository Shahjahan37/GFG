
class DeleteMiddleElementOfStack
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        // System.out.println(s);
        // System.out.println(sizeOfStack);
        if(sizeOfStack%2==0){
            int t=(sizeOfStack/2)-1;
            s.remove(t);
        }
        else{
            int t=sizeOfStack/2;
            s.remove(t);
        }
    } 
}