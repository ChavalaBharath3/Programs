
/*
         * Input: numRows = 5
         * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
         * Steps:
         * 1)method pascal return ArrayList<List<Integer>> having parameters = no of
         * rows
         * 2)one arraylist first row object, firstrow.add(1)
         * 3)curentRow object
         * 3)for(int i=1;i<noofrows;i++){
         * previousrow = firstrow.get(i-1)
         * cr.add(1)
         * for(j=1;j<i;j++){
         * cr.add(previousrow.get(j-1)+previousrow.get(j))}}
         * cr.add(1)
         * triangle.add(cr);
*/
import java.util.*;

public class PascalTriangleSingleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows to print: ");
        int rows = sc.nextInt();
        System.out.print("Enter the return index to print: ");
        int returnIndex = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>(rows);
        ArrayList<Integer> list = pascalTri(triangle, rows, returnIndex);
        System.out.println(list.toString());
    }

    public static ArrayList<Integer> pascalTri(ArrayList<ArrayList<Integer>> triangle, int rows, int returnIndex) {
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < rows; i++) {
            ArrayList<Integer> previousRow = triangle.get(i - 1);
            ArrayList<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(i - j));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle.get(returnIndex);
    }
}