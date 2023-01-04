package Easy;

import java.util.*;
import java.io.*;
public class GradingStudents{

    private static int nextMultiple(int n){
        if(n%5==0){
            n=n+1;
        }
        int ans=0;
        for(int i=n;i<=n+5;i++){
            if(i%5==0){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> modified=new ArrayList<>();
        for(Integer g:grades){
            if(g<38){
                modified.add(g);
            }
            else{
                int nextMul=nextMultiple(g);
                if(nextMul-g<3){
                    modified.add(nextMul);
                }
                else{
                    modified.add(g);
                }
            }
        }
        return modified;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }
        System.out.println(gradingStudents(grades));
    }
}