

public class Save {
    public static void main(String[] args) {
        int n=7;
        int m=19;
        int s=2;
        String str="";
        String fin="";
        
        for(int i=s;i<=n;i++){
            fin+=i;
        }
        while(m-str.length()!=0){
            str+=fin;
        }
        System.out.println(str);
    }
}
