import java.util.*;

public class NmeetingsOneroom{
    static class Pair implements Comparable<Pair>
    {
        int a1;
        int a2;
        Pair (int a1, int a2) 
        {
            this.a1 = a1;
            this.a2 = a2;
        }
        public int compareTo(Pair other) 
        {
            return this.a2 - other.a2;
        }
    }
    public static void main(String[] args) {
        int [] start={1,3,0,5,8,5};
        int [] end={2,4,6,7,9,9};
        Pair[] pairs = new Pair[start.length];
        for (int i = 0; i < pairs.length; i++)
        {
            pairs[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(pairs);

        int count=1;
        int meetE=pairs[0].a2;

        for(int i=1;i<start.length;i++){
            if(pairs[i].a1>meetE){
                count++;
                meetE=pairs[i].a2;
            }
        }
        System.out.println(count);
    }
}