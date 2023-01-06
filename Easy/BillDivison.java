package Easy;
public class BillDivison {
    public static void main(String[] args) {
        int [] bill={3,10,2,9};
        int k=1;
        int b=12;

        int annaAmt=0;

        for(int i=0;i<bill.length;i++){
            if(i!=k){
                annaAmt+=bill[i];
            }
        }
        annaAmt=annaAmt/2;
        if(annaAmt==b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-annaAmt);
        }

    }
}
