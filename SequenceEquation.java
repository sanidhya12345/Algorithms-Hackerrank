import java.util.Arrays;

public class SequenceEquation {
    private static int findIndexSequence(int [] arr,int value){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                ans=i+1;
                break;
            }
        }
        int finalans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans){
                finalans=i+1;
            }
        }
        return finalans;
    }
    public static void main(String[] args) {
        int [] arr={4,3,5,1,2};
        int [] a=Arrays.copyOf(arr, arr.length);
        Arrays.sort(a);
        for(Integer i:a){
            System.out.println(findIndexSequence(arr, i));
        }
    }
}
