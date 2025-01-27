package in.roopsai.twopointers;

public class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {
        // Use 2 Pointer Approach
        int k = 0;
        int i = 0;
        int j = 0;
        int m = word1.length();
        int n = word2.length();
        char[] arr = new char[m + n];
        while (i < m && j < n) {
            if (k % 2 == 0) {
                arr[k] = word1.charAt(i);
                i++;
            } else {
                arr[k] = word2.charAt(j);
                j++;
            }
            k++;
        }

        while (i < m) {
            arr[k] = word1.charAt(i);
            i++;
            k++;
        }

        while (j < n) {
            arr[k] = word2.charAt(j);
            j++;
            k++;
        }

        return new String(arr);
    }
}
