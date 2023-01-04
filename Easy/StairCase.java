package Easy;


import java.io.*;
public class StairCase {

    public static void staircase(int n) {
        String pat="";

        for(int i=0;i<n;i++){

            for(int j=i;j<n-1;j++){
                pat+=" ";
            }
            for(int k=0;k<i+1;k++){
                pat+="#";
            }
            pat+="\n";
        }
        System.out.println(pat);
    
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }
}
