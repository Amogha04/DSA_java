package Greedy;

import java.util.Arrays;

public class Job_Sequencing {
    public static void main(String[] args) {
        int[] profits = {35,30,25,20,15,12,5};
        int[] deadlines = {3,4,4,2,3,1,2};
        //n = 7
        //Objective : Maximize the profit
        //Each job takes single unit of time
       Job_Sequencing_with_Deadlines(profits,deadlines);
    }
    private static void Job_Sequencing_with_Deadlines(int[] profits,int[] deadlines){
        int MaxWait = Arrays.stream(deadlines).max().getAsInt();
        Integer[] jobs = new Integer[MaxWait];

        for (int i = 0; i < profits.length; i++) {
            int index = deadlines[i] - 1;
            while(index >= 0){
                if(jobs[index] == null){
                    jobs[index] = i + 1;
                    break;
                }else index --;
            }
        }
        for (Integer integer : jobs) {
            if (integer != null) {
                System.out.print("J" + integer + "->");
            }
        }
        System.out.println();
        int profit = 0;
        for (Integer job : jobs) {
            if (job != null) {
                profit += profits[job - 1];
            }
        }
        System.out.println("Total gain :" + profit);
    }
}
