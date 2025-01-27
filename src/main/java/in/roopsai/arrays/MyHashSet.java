package in.roopsai.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * lc 705 Design HashSet
 */
class MyHashSet {

    private static final int capacity = 1000000;

    private List<LinkedList<Integer>> list = new ArrayList<>(capacity);

    public MyHashSet() {
        for(int i = 0; i < capacity; i++) {
            list.add(new LinkedList<Integer>());
        }
    }

    public void add(int element) {
        int key = element % capacity;
        LinkedList<Integer> bucket = list.get(key);
        if (contains(element)) {
            return;
        }
        bucket.add(element);
    }

    public void remove(int element) {
        int key = element % capacity;
        LinkedList<Integer> bucket = list.get(key);
        bucket.remove((Integer) element);
    }

    public boolean contains(int element) {
        int key = element % capacity;
        LinkedList<Integer> bucket = list.get(key);
        return bucket.contains(element);
    }
}