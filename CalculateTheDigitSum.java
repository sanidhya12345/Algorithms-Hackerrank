public class CalculateTheDigitSum {
    public String digitSum(String s, int k) {
        if(s.length()<=k)return s;
        while(s.length()>k)
        {
            String str="";
            int left=s.length()%k;
            for(int i=0;i<s.length()-left;i+=k)
            {
                str+=(sumstring(s.substring(i,i+k)));
            }
            if(s.length()%k!=0)str+=(sumstring(s.substring(s.length()-left,s.length())));
            s=str;
            System.out.println(s);
        }
        return s;
        
    }
    
    public String sumstring(String str){
        int sum=0;
        for(char i:str.toCharArray())
        {
            sum+=(i-'0');
        }
        return String.valueOf(sum);
    }
}
