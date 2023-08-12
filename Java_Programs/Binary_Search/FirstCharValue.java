/*
 * Steps:
 * Input Input: letters = ["c","f","j"], target = "a"
   Output: "c"
   Input: letters = ["c","f","j"], target = "c"
   Output: "f"
   Input: letters = ["x","x","y","y"], target = "z"
   Output: "x"
 */
public class FirstCharValue {
    public static void main(String[] args) {
        char arr[] = { 'x', 'x', 'y', 'y' };
        char target = 'z';
        char results = searchIndexOrValue(arr, target);
        System.out.println(results);
    }

    public static char searchIndexOrValue(char arr[], int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target > arr[midIndex]) {
                startIndex = midIndex + 1;
            } else if (target < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                return arr[midIndex];
            }
        }
        return arr[startIndex % (arr.length - 1)];
    }
}