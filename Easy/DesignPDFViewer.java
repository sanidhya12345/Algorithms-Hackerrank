package Easy;

import java.util.List;

public class DesignPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
             int max=Integer.MIN_VALUE;
             for(char c:word.toCharArray()){
                int index=c-'a';
                max=Math.max(max,h.get(index));
             }        
             return max*word.length();
    }
}
