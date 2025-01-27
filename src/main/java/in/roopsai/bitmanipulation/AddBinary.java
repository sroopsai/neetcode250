package in.roopsai.bitmanipulation;

public class AddBinary {

    public static String addBinary(String a, String b) {
        a = reverse(a);
        b = reverse(b);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int digitA = 0;
            int digitB = 0;

            if (i < a.length()) {
                digitA = a.charAt(i) - '0';
            }

            if (i < b.length()) {
                digitB = b.charAt(i) - '0';
            }

            int total = digitA + digitB + carry;
            sb.append(total % 2);
            carry = total / 2;
        }

        if (carry == 1) {
            sb.append(carry);
        }

        return reverse(sb.toString());


    }

    public static String reverse(String a) {

        char[] array = new char[a.length()];
        int i = 0;
        for(int j = a.length() - 1; j >= 0; j--) {
            array[a.length() - 1 - j] = a.charAt(j);
        }

        return new String(array);
    }

    public static void main(String[] args) {
        String a = "110";
        String b = "11";
        System.out.println(addBinary(a, b));
    }
}
