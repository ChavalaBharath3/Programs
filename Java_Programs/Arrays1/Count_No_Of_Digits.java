//input={12,3,4,7846,234}
public class Count_No_Of_Digits {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 7846, 234, 3456 };
        int results = check(arr);
        System.out.println(results);
    }

    static int check(int arr[]) {
        int count = 0;
        if (arr.length < 0) {
            return 0;
        }
        for (int num : arr) {
            if (even(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int even(int num) {
        int count1 = 0;
        if (num > 0) {
            while (num > 0) {
                count1++;
                num = num / 10;
            }
        }
        return count1;
    }
}