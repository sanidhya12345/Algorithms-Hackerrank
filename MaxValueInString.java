public class MaxValueInString {
    public int maximumValue(String[] strs) {
        int i,j,maxValue=0;
        
        for(i=0;i<strs.length;i++){
            
            j=0;
        
            while( j < strs[i].length() && (strs[i].charAt(j) >= 48 && strs[i].charAt(j) <= 57)){
                j++;
            }
            
            if(strs[i].length()==j){
                
                if(Integer.parseInt(strs[i]) > maxValue){
                    maxValue = Integer.parseInt(strs[i]);
                }
            }else{
                
                if(maxValue < strs[i].length()){
                     maxValue = strs[i].length();
                }
            }
        }
        
        
        return maxValue;
    }
}
