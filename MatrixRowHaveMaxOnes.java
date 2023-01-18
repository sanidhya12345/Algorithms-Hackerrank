import java.util.*;
public class MatrixRowHaveMaxOnes {
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<M;j++){
                if(Mat[i][j]==1){
                    count++;
                }
            }
            map.put(i,count);
        }
        int max=Collections.max(map.values());
        List<Integer> list=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)==max){
                list.add(key);
            }
        }
        Collections.sort(list);
        return list.get(0);
    }
}
