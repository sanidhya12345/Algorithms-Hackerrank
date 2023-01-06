package Easy;

import java.util.HashMap;
import java.util.List;

public class SalesByMatch { public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
       HashMap<Integer,Integer> map=new HashMap<>();
       for(Integer i:ar){
           if(!map.containsKey(i)){
               map.put(i,1);
           }
           else{
               map.put(i,map.get(i)+1);
           }
       }
       
       int count=0;
       for(Integer i:map.keySet()){
           if(map.get(i)>=2){
               count+=map.get(i)/2;
           }
       }
       return count;
    }
}
