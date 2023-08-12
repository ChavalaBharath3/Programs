import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the no of elements in the array: ");
        int arrLen = sc.nextInt();
        int arr[] = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            System.out.println("Enter the element at index[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
        for (int i = 0; i < arrLen; i++) {
            int value = arr[i];
            list.put(value, list.getOrDefault(value, 0) + 1);
        }
        System.out.println(list.toString());
        System.out.println(simple(list));

    }

    public static int simple(HashMap<Integer, Integer> listMap) {
        for (Map.Entry<Integer, Integer> entry : listMap.entrySet()) {
            int value = entry.getValue();
            int count = 0;
            for (Map.Entry<Integer, Integer> innerEntry : listMap.entrySet()) {
                if (innerEntry.getValue().equals(value)) {
                    count++;
                }
            }
            if (count > listMap.size() / 2) {
                return value;
            }
            return -1;
        }
        return -1;
    }
}