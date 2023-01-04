package Easy;

import java.util.*;
import java.io.*;
public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        
        List<Integer> applesFelt=new ArrayList<>();
        List<Integer> orangesFelt=new ArrayList<>();

        for(Integer apple:apples){
            applesFelt.add(a+apple);
        }
        for(Integer orange:oranges){
            orangesFelt.add(b+orange);
        }

        int countApples=0;
        int countOrange=0;

        for(Integer apple:applesFelt){
            if(apple>=s && apple<=t) countApples++;
        }
        for(Integer orange:orangesFelt){
            if(orange>=s && orange<=t) countOrange++;
        }
        System.out.println(countApples);
        System.out.println(countOrange);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        String[] applesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> apples = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesTemp[i]);
            apples.add(applesItem);
        }

        String[] orangesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesTemp[i]);
            oranges.add(orangesItem);
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
