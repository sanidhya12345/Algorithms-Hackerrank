import java.util.ArrayList;
import java.util.Arrays;

public class ShortestToCharacter {
    static ArrayList<Integer>list=new ArrayList<>();
    private static void fillIndices(String s,char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                list.add(i);
            }
        }
    }
    public static void main(String[] args) {
        String s="loveleetcode";
        char c='e';
        int ptr=0;
        int [] res=new int[s.length()];
        fillIndices(s, c);
        for(int i = 0;i<res.length;i++){
            int min = Integer.MAX_VALUE;
            for(int p : list){
                min = Math.min(min, Math.abs(i-p));
            }
            res[i] = min;
        }
        System.out.println(Arrays.toString(res));
    }
}
