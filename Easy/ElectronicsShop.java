package Easy;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
         int maxPrice=-1;
        for(Integer i:keyboards){
            for(Integer j:drives){
                if(i+j<=b){
                    maxPrice=Math.max(maxPrice,i+j);
                }
            }
        }
        return maxPrice;
    }
}
