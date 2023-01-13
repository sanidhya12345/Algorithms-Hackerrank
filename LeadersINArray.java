import java.util.ArrayList;
import java.util.Stack;

public class LeadersINArray{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,0};
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> lst=new ArrayList<>();
        int size=arr.length;
        stack.push(arr[size - 1]);
 
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= stack.peek()) {
                stack.push(arr[i]);
            }
        }
        while (!stack.empty()) {
            lst.add(stack.pop());
        }
       System.out.println(lst);
    }
}