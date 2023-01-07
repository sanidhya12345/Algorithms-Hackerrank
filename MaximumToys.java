import java.util.Arrays;

public class MaximumToys {
    static int toyCount(int N, int K, int cost[])
    {
        
       int count = 0, sum = 0;
    Arrays.sort(cost);
    for (int i = 0; i < N; i++)
    {
 
        if (sum +cost[i] <= K)
        {
            sum = sum + cost[i];
            count++;
        }
    }
    return count;
    }
}
