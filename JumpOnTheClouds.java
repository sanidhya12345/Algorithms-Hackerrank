public class JumpOnTheClouds {
    public static void main(String[] args) {
        int [] c={};
        int energy=100;
        int index=0;
        int size=c.length;
        int k=2;
        do {
            if(c[(index + k) % size] == 1){
                energy-=3;
            }
            else{
                energy-=1;
            }
            index = (index + k) % size;
        } while (index!=0);
    }
}
