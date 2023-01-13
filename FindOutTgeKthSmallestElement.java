import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer number1, Integer number2) {
        int value=number1.compareTo(number2);
        if(value>0) return -1;
        else if(value<0) return 1;
        else return 0;
    }
}

public class FindOutTgeKthSmallestElement {
    public static void main(String[] args) {
        int [] arr={7,10,4,3,20,15};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>(new CustomComparator());
        for(Integer i:arr){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        System.out.println(pq.peek());
    }
}
