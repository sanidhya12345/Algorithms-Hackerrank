public class GenerateTheString{
    public String generateTheString(int n) {
        String s="";
        if(n%2!=0){
            char c='a';
            for(int i=0;i<n;i++){
                s+=c;
            }
        }
        else{
            n=n-1;
            char c='a';
            for(int i=0;i<n;i++){
                s+=c;
            }
            s+='b';
        }
        return s;
    }
}