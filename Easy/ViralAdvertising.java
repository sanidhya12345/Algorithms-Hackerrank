package Easy;

public class ViralAdvertising {
    static int [] map=new int[51];
    public static int viralAdvertising(int n) {
        map[0]=5;
        map[1]=6;
        for(int i=2;i<=50;i++){
            map[i]=(int)Math.floor(map[i-1]/2)*3;
        }
        for(int i=0;i<51;i++){
            map[i]=(int)Math.floor(map[i]/2);
        }
        for(int i=1;i<51;i++){
            map[i]=map[i-1]+map[i];
        }
        return map[n-1];
    }
}
