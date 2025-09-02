package Greedy;

/*
Problem Discussion

Given N bulbs, either on (1) or off (0).
Turning on ith bulb causes all remaining bulbs on the right to flip.

Find the min number of switches to turn all the bulbs on.

Constraints:
    1 <= N <= 1e5
    A[i] = {0, 1}
*/

public class Bulbs {
    public static void main(String[] args) {
        boolean[] bulbs = {true, false, true, true, false, false, true, false, true};
        System.out.println(minSwitches(bulbs));
    }

    private static int minSwitches(boolean[] bulbs) {
        int flips = 0;

        for (boolean bulb : bulbs) {
            boolean effectiveState = (flips % 2 == 0) == bulb;

            if (!effectiveState) {
                flips++;
            }
        }
        return flips;
    }
}
