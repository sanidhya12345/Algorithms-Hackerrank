package Easy;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
         
         int totalcover=0;
         int noofvalley=0;
         for(char c:path.toCharArray()){
             if(c=='D'){
                 totalcover-=1;
             }
             if(c=='U'){
                 totalcover+=1;
             }
             
             if(c=='U' && totalcover==0){
                 noofvalley++;
             }
         }
         return noofvalley;
    
        }
        
    
}
