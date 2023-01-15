package Easy;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
            int countArivalStudents=0;
            for(Integer i:a){
                if(i<=0){
                     countArivalStudents+=1;
                }
            }
            return countArivalStudents>=k?"NO":"YES";
        }
}
