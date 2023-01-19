public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String [] array=s.split(" ");
        String s1="";
        int count=0;
        for(String i:array){
            s1+=i+" ";
            count++;
            if(count==k)break;
        }
        return s1.trim();
    }
}
