package in.roopsai.arrays;

import java.sql.Array;
import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        int[] alphabetFrequency = new int[26];
        for(String str : strs) {
            Arrays.fill(alphabetFrequency, 0);
            StringBuilder sb = new StringBuilder();
            for(char ch : str.toCharArray()) {
                alphabetFrequency[ch - 'a']++;
            }

            for(int i = 0; i < 26; i++){
                sb.append("#");
                sb.append(alphabetFrequency[i]);
            }
            String key = sb.toString();
            if (map.containsKey(key)) {
                List<String> value = map.get(key);
                value.add(str);
            } else {
                List<String> value = new ArrayList<>();
                value.add(str);
                map.put(key, value);
            }
        }

        return map.values().stream().toList();

    }
}
