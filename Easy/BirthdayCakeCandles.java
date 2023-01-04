package Easy;

import java.util.*;
import java.io.*;
public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        long maxHeightCandle=candles.get(0);
        long maxHeightCandleCount=0;

        for(Integer can:candles){
            maxHeightCandle=Math.max(maxHeightCandle,can);
        }

        for(Integer can:candles){
            if(can==maxHeightCandle){
                maxHeightCandleCount++;
            }
        }
        return (int) maxHeightCandleCount;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        System.out.println(birthdayCakeCandles(candles));
    }
    
}
