package Easy;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class CompareTriplets{
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> compList=new ArrayList<>();
        int alicePoints=0;
        int bobPoints=0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
                alicePoints++;
            }
            else if(b.get(i)>a.get(i)){
                bobPoints++;
            }
        }
        compList.add(alicePoints);
        compList.add(bobPoints);

        return compList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        System.out.println(compareTriplets(a, b));
    }
}