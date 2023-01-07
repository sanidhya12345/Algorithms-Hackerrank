import java.util.Arrays;

public class MinimizeTheSumOfProduct {
    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        long minproduct=0;
        for(int i=0;i<b.length;i++){
            minproduct+=(a[i]*b[(int)n-1-i]);
        }
        return minproduct;
    }
}
