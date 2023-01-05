package Easy;

import java.util.*;
import java.io.*;
public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int start=1;
        int end=Collections.min(b);

        List<Integer> aFactors=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(Integer i:a){
            for(int val=start;val<end;val++){

                if(val%i==0){
                    aFactors.add(val);
                }
            }
        }

        for(Integer i:aFactors){

            for(Integer val:a){

                if(i%val!=0){
                   ans.add(i);
                }
            }
        }
       
        aFactors.removeAll(ans);
        Set<Integer> set=new HashSet<>(aFactors);
        
        int fc=0;
        for(Integer i:b){
            int c=0;
            for(Integer j:set){
                if(i%j==0){
                    c++;
                }
                if(c==b.size()){
                    fc++;
                }
            }
        }
        return fc;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }
        System.out.println(getTotalX(arr, brr)); 
    }
}
