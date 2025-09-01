package Greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Knapsack {
    public static void main(String[] args) {
      int[] profits = {10,5,15,7,6,18,3};
      int[] weights = {2,3,5,7,1,4,1};
      //Objective : Maximize the profit
      //Constraints : Total weight <= 15
        System.out.println(knapsack(profits,weights,15));
    }
    private static double knapsack(int[] profits,int[] weights,int MaxWeight){
        double[] ProfitByWeight = new double[profits.length];
        for (int i = 0; i < ProfitByWeight.length; i++) {
            ProfitByWeight[i] = (double) profits[i] / weights[i];
        }
        Map<Integer,Double> map = new HashMap<>();
        int index = 0;
        int length = ProfitByWeight.length;
        while (length > 0){
            map.put(index,ProfitByWeight[index]);
            index++;
            length--;
        }
        PriorityQueue<Map.Entry<Integer,Double>> maxHeap =
           new PriorityQueue<>((e1,e2) -> e2.getValue()
                   .compareTo(e1.getValue()));

        maxHeap.addAll(map.entrySet());

        length = ProfitByWeight.length;

        double[] x = new double[length];
        int weight = 0;
        double profit = 0.0;
        int remainingCapacity = MaxWeight;
        while (!maxHeap.isEmpty() && remainingCapacity > 0) {
            Map.Entry<Integer,Double> entry = maxHeap.poll();
            int idx = entry.getKey();
            int currWeight = weights[idx];

            if (currWeight <= remainingCapacity) {
                x[idx] = 1;
                remainingCapacity -= currWeight;
            } else {
                x[idx] = (double) remainingCapacity / currWeight;
                remainingCapacity = 0;
            }
        }

        for (int i = 0; i < x.length; i++) {
            weight += (int) (weights[i] * x[i]);
            profit += profits[i] * x[i];
        }
        if(weight > MaxWeight){
            return -1;
        }
       return profit;
    }
}
