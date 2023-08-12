public class FindPeekPoint {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 4, 3, 2 };
        int results = peekPoint(arr);
        System.out.println(results);
    }

    public static int peekPoint(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}