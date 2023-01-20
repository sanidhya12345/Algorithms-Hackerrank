import java.util.Arrays;

public class CircularRotation {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int k=2;
        while(k--!=0){
            for(int i=0;i<arr.length-1;i++){
                int temp=arr[arr.length-i-1];
                arr[arr.length-i-1]=arr[arr.length-i-2];
                arr[arr.length-i-2]=temp;           
             }
        }
        System.out.println(Arrays.toString(arr));
    }
}
