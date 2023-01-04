package Easy;
import java.io.*;
public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String rtnStr = "";
        String theFirstTwoDigit = s.substring(0, 2);
        if (s.indexOf("A") >= 1) {            
            if ("12".equals(theFirstTwoDigit) ) {
                rtnStr = "00" + s.substring(2, s.length() - 2);
            }else {
                rtnStr = s.substring(0, s.length() - 2);
            }
        }else if (s.indexOf("P") >= 1) {
            if ("12".equals(theFirstTwoDigit) ) {
                rtnStr = s.substring(0, s.length() - 2);
            }else {
                Integer theFirstTwoDigitInt 
                  = Integer.parseInt(theFirstTwoDigit) + 12;
                rtnStr = theFirstTwoDigitInt 
                           + s.substring(2, s.length() - 2);
            }
        }else {}
        return rtnStr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println(timeConversion(s));
    }
   
}
