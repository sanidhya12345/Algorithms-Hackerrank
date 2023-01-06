package Easy;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
           int front = p / 2;
        int back = (n - p) / 2;
        if (n - p == 1 && n % 2 == 0) back++;
        if (front < back) {
            return front;
        }   else {
            return back;
        }
        }
    
}
