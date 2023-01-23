import java.util.Stack;

public class GeekAndTheString {
        public static String removePair(String s) {
            // code here
            Stack<Character> stk = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()){
                
                if(!stk.isEmpty() && stk.peek().equals(c)){
                    stk.pop(); 
                }else{
                    stk.push(c);
                }
            }
            
            while(stk.size() > 0){
                sb.insert(0, stk.pop()); 
            }
            if(sb.toString().length()==0){
                return "-1";
            }
            
            return sb.toString();
    }    
    public static void main(String[] args) {
        String s="rnnvvssssssmmmmmmcccsssssss";
        System.out.println(removePair(s));
    }
}
