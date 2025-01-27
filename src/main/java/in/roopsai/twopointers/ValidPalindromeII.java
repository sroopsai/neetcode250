package in.roopsai.twopointers;

public class ValidPalindromeII {


    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {

        return check(s, 0, s.length() - 1, 1);
    }

    public static boolean check(String s, int l, int r, int k) {
        if (k < 0) return false;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return check(s, l + 1, r, k - 1) || check(s, l, r - 1, k - 1);
            }
        }
        return true;
    }
}
