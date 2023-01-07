public class MaxMin {
    public static int findSum(int A[],int N) 
    {
        //code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            min=Math.min(min,A[i]);
            max=Math.max(max,A[i]);
        }
        return max+min;
    }
    
}
