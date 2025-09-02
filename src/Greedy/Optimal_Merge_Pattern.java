package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Optimal_Merge_Pattern {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20, 30, 10, 5, 30));
        System.out.println("Minimum cost of merge = " + optimal_merge_pattern(list));
    }

    private static int optimal_merge_pattern(ArrayList<Integer> list) {
        // Use a min-heap for efficient smallest extraction
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);

        int minCost = 0;

        while (pq.size() > 1) {
            // Extract two smallest
            int first = pq.poll();
            int second = pq.poll();

            int cost = first + second;
            minCost += cost;

            // Insert merged file back into heap
            pq.add(cost);
        }

        return minCost;
    }
}
