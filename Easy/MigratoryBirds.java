package Easy;


import java.util.*;
public class MigratoryBirds {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,4,3,2,1,3,4};
        List<Integer> ans=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(Integer i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        int maxValue=Collections.max(map.values());
        for(Integer key:map.keySet()){
            if(maxValue==map.get(key)){
                ans.add(key);
            }
        }
        if(ans.size()<=1){
            System.out.println(ans.get(0));
        }
        else{
            System.out.println(Collections.min(ans));
        }
    }
}
