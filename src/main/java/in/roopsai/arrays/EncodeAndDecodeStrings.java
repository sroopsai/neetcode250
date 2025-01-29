package in.roopsai.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) return Character.toString((char) 257);
        return String.join(Character.toString((char) 258), strs);
    }

    public List<String> decode(String str) {
        String emptyString = Character.toString((char) 257);
        if (str.contentEquals(emptyString)) return new ArrayList<>();

        return Arrays.stream(str.split(Character.toString((char) 258))).toList();
    }

}
