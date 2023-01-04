package Easy;
import java.util.*;
import java.io.*;
public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long minSum = 0,maxSum = 0;
        for(int i = 0;i < 4;i++)
            minSum += arr.get(i);
        for(int i = 4;i >= 1;i--)
            maxSum += arr.get(i);
        System.out.print(minSum+ " " + maxSum);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        miniMaxSum(arr);

        bufferedReader.close();
    }
    
}
