package Easy;


public class SubarrayDivison{
    public static void main(String[] args) {
        int [] arr={1,2,1,3,2};
        int d=3;
        int m=2;
        int count=0;
        for(int i=0;i<=arr.length-m;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum+=arr[j];
            }
            if(sum==d){
                count++;
            }
        }
        System.out.println(count);


    }
}