import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int noOfEle = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(noOfEle);
        for (int i = 0; i < noOfEle; i++) {
            System.out.print("Enter the element at index: " + i + ": ");
            list.add(scanner.nextInt());
        }
        int[] newList = addPlus(list, noOfEle);
        System.out.println(Arrays.toString(newList));

    }

    /*
     * steps:
     * iteration 1-> 1234%10 =4, 3,2,1
     * reverse the number 4,3,2,1
     * 
     */
    public static int[] addPlus(ArrayList<Integer> list, int noElements) {
        ArrayList<Integer> newList = new ArrayList<>(noElements);
        Integer arr1[] = new Integer[list.size()];
        arr1 = list.toArray(arr1);
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total = total * 10 + arr1[i];
        }
        System.out.println("Single value of the elements: " + total);
        int add_One = total + 1;
        System.out.println(add_One);
        String str = Integer.toString(add_One);
        char chars[] = str.toCharArray();
        int newArray[] = new int[chars.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = Integer.parseInt(Character.toString(chars[i]));
        }
        return newArray;
    }
}