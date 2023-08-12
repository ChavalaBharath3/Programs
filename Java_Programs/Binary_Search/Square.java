import java.lang.annotation.Target;

public class Square {
    public static void main(String[] args) {

        System.out.println(searchSquare(8));
    }

    public static int searchSquare(int n) {
        int start = 0;
        int end = n;
        int ans = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }

        }
        return ans;
    }
}
/*
 * target 8
 * 0 1 2 3 4 5 6 7 8
 * mid = 0+8/2 = 4
 */