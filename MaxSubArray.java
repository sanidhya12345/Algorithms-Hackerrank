import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1};
        int k=1;
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<=arr.length-k;i++){
        //    int maxv=Integer.MIN_VALUE;
        //    for(int j=i;j<i+k;j++){
        //       maxv=Math.max(maxv,arr[j]);   
        //    }
        //    list.add(maxv);
        // }
        int n=arr.length;
        // arr[n-1]=0;
        // arr[n-1]+=arr[n-2];
        // arr[n-2]=0;
        // arr[n-2]+=arr[n-3];
        // arr[n-3]=0;
        for(int i=0;i<=1;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>i+1;j--){
                arr[n-1]=0;
                arr[j]+=arr[j-1];
                arr[j-1]=0;
            }
            arr[i]=temp;
        }
        // for(int i=1;i<arr.length;i+=2){
        //     int temp=arr[arr.length-1];
        //     arr[arr.length-1]=0;
        //     a
        // }
        System.out.println(Arrays.toString(arr));
    }
}
