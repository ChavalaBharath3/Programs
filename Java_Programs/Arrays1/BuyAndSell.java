
/*
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
 * 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must
 * buy before you sell.
 */
/*
 * Steps:
 * 1)input the array using scanner 
 * 2)enter the day to buy the stock that stock = arr[day],here day=The buyer entered date
 * 3)to sell the stock the day should be greater than the day that user buy.
 * 4)if(arr[dateSell]>arr[day])
 * 5)minius the geting the profit or loss -> arr[dateSell] - arr[day_buyed];
 * 
 */
import java.util.*;

public class BuyAndSell {
    public static void main(String[] args) {
        // int profit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the noof elements");
        int noofEle = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(noofEle);
        for (int i = 0; i < noofEle; i++) {
            System.out.print("Enter the element at index[" + i + "]:");
            list.add(sc.nextInt());
        }
        System.out.println("Dates to buy the stock: " + list.toString());
        System.out.println("Enter the index of the above list that you want to buy: ");
        int index1 = sc.nextInt();
        int dayBuyed = list.get(index1);
        System.out.println("The price of the stock at buying : " + dayBuyed);
        System.out.println("Enter the index of the day you want to sell the stock: ");
        int index2 = sc.nextInt();
        int daySell = list.get(index2);
        System.out.println("The price of the stock at selling : " + daySell);
        if (list.indexOf(dayBuyed) < list.indexOf(daySell)) {
            int profit = daySell - dayBuyed;
            System.out.println("profit earned: " + profit);
        }
        // System.out.print("Enter the index day ");
    }
}