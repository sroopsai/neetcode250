package in.roopsai.arrays;

public class MyHashSetOptimised {

    private static final int primary = 1000;

    private static final int secondary = 1000;

    private final boolean[][] buckets;

    public MyHashSetOptimised() {
        buckets = new boolean[primary][];
    }

    public void add(int element) {
        int p = element / primary;
        int s = element % secondary;
        if (buckets[p] == null) {
            buckets[p] = new boolean[secondary];
            buckets[p][s] = true;
        }
    }

    public void remove(int element) {
        int p = element / primary;
        int s = element % secondary;
        if (buckets[p] != null) {
            buckets[p][s] = false;
        }
    }

    public boolean contains(int element) {
        int p = element / primary;
        int s = element % secondary;
        if (buckets[p] != null) return buckets[p][s];
        return false;
    }

    public static void main(String[] args) {

    }

}
