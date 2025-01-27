package in.roopsai.arrays;

/**
 * lc 242 Valid Anagram
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m != n) return false;

        int[] alphaFreq = new int[26];
        for (int i = 0; i < m; i++) {
            alphaFreq[s.charAt(i) - 'a']++;
            alphaFreq[t.charAt(i) - 'a']--;
        }

        for (int j : alphaFreq) {
            if (j != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
