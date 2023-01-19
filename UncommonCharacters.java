import java.util.*;
public class UncommonCharacters {
    private static HashSet<Character> difference(String a,String b){
        HashSet<Character> list=new HashSet<>();
        for(char ch:a.toCharArray()){
            if(b.indexOf(ch)==-1){
                list.add(ch);
            }
        }
        for(char ch:b.toCharArray()){
            if(a.indexOf(ch)==-1){
                list.add(ch);
            }
        }
        return list;
    }
    String UncommonChars(String A, String B)
    {
        // code here
        String s="";
        HashSet<Character> ls=difference(A,B);
        List<Character> list = new ArrayList<>(ls);
        Collections.sort(list);
        for(char c:list){
            s+=c;
        }
        return s.length()==0?"-1":s;
    }
}
