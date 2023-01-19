public class isAnagram {
    public static boolean isAnagram(String a,String b)
    {
       int [] map=new int[26];
       for(char c:a.toCharArray()){
           map[c-'a']++;
       }
       for(char c:b.toCharArray()){
           map[c-'a']--;
       }
       int count=0;
       for(Integer i:map){
           if(i==0)count++;
       }
       return count==26;
    }
}
