package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double plus=0;
        double minus=0;
        double zero=0;
        for(Integer i:arr ){
            if(i>0){
                plus++;
            }
            else if(i<0){
                minus++;
            }
            else{
                zero++;
            }
        }
        plus=plus/arr.size();
        minus=minus/arr.size();
        zero=zero/arr.size();
        System.out.println(String.format("%.6f", plus));
        System.out.println(String.format("%.6f", minus));
        System.out.println(String.format("%.6f", zero));
    
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        plusMinus(arr);

        bufferedReader.close();

    }
}
