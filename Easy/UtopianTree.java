package Easy;
public class UtopianTree {
    static int [] map=new int[61];
    public static int utopianTree(int n) {
    // Write your code here
    map[0]=1;
    map[1]=2;
       for(int i=2;i<=60;i++){
           if(i%2==0){
               map[i]=map[i-1]+1;
           }
           else{
               map[i]=map[i-1]*2;
           }
       }   
       
      return map[n];
    }
}
