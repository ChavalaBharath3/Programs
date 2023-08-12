import java.util.*;

class palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean check_palindrome = isPalindrome(num);
        System.out.println(check_palindrome);
        sc.close();
    }

    public static boolean isPalindrome(int num) {
        int res = 0;
        int temp = num;
        int rem;
        while (num > 0) {
            rem = num % 10;
            res = res * 10 + rem;
            num = num / 10;
        }
        if (temp == res) {
            return true;
        } else {
            return false;
        }
    }
}