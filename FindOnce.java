import java.util.HashMap;

public class FindOnce {
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
