package Easy;

public class BeautifulDays {
    public static int reverseNumber(int n){
        String num=Integer.toString(n);
        String ans="";
        for(int i=num.length()-1;i>=0;i--){
            ans+=num.charAt(i);
        }
        return Integer.parseInt(ans);
    }
    public static int beautifulDays(int i, int j, int k) {
        int count=0;
    // Write your code here
        for(int start=i;start<=j;start++){
            if(Math.abs(start-reverseNumber(start))%k==0){
                count++;
            }
        }
        return count;
    }
}
