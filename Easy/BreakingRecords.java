package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingRecords{
    public static void main(String[] args) {
        int [] arr={10,5,20,20,4,5,2,25,1};
        int min=arr[0];
        int [] lowest=new int[arr.length];
        lowest[0]=min;
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            lowest[i]=min;
        }
        System.out.println(Arrays.toString(lowest));

        int max=arr[0];
        int [] highest=new int[arr.length];
        highest[0]=max;

        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            highest[i]=max;
        }
        int mincount=0;
        int maxcount=0;

        for(int i=1;i<arr.length;i++){
            if(lowest[i-1]>lowest[i]){
                mincount++;
            }
            if(highest[i-1]<highest[i]){
                maxcount++;
            }

        }
        List<Integer> list=new ArrayList<>();
        list.add(maxcount);
        list.add(mincount);
    }
}