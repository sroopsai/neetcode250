package in.roopsai.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            boxes.put(i, new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char ch = board[i][j];
                if (ch == '.') continue;
                Set<Character> row = rows.get(i);
                if (row.contains(ch)) return false;
                else row.add(ch);

                Set<Character> col = cols.get(j);
                if (col.contains(ch)) return false;
                else col.add(ch);

                Set<Character> box = boxes.get(i / 3 * 3 + j / 3);
                if (box.contains(ch)) return false;
                else box.add(ch);

            }
        }

        return true;


    }
}
