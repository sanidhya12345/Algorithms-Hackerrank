package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference{

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDia=0;
        int rightDia=0;

        for(int i=0;i<arr.size();i++){
            leftDia+=arr.get(i).get(i);
        }
        
        for(int i=0;i<arr.size();i++){
            rightDia+=arr.get(i).get(arr.size()-i-1);
        }
        int diagonalDiff=Math.abs(leftDia-rightDia);

        return diagonalDiff;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        System.out.println(diagonalDifference(arr));

    }
}