package in.roopsai.arrays;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        // Create a HashMap to store pairs of [element and count(element)]
        Map<Integer, Integer> map = new HashMap<>();


        Arrays.stream(nums).forEach(el -> map.put(el, map.getOrDefault(el, 0) + 1));

        // Create a Priority Queue of Entries
        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k, Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<Integer> solution = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : queue) {

            solution.add(entry.getKey());

        }

        return solution.stream().mapToInt(Integer::intValue).toArray();


    }
}
