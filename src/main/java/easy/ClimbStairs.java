package main.java.easy;

/*
You are climbing a stair case and it takes A steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbStairs {

    public static void testCases() {
        int steps = 5;
        System.out.println(climbStairs(steps));
        steps = 10;
        System.out.println(climbStairs(steps));
        steps = 1000;
        System.out.println(climbStairs(steps));
    }

    //Fibonacci
    private static int climbStairs(int steps) {
        if (steps < 2) {
            return steps;
        }
        int[] cache = new int[steps + 1];
        cache[0] = 1;
        cache[1] = 1;
        for (int i = 2; i <= steps; i++) {
            cache[i] = cache[i - 2] + cache[i - 1];
        }
        return cache[steps];
    }
}
