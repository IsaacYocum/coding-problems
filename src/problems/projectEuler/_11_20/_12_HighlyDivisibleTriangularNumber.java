package problems.projectEuler._11_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _12_HighlyDivisibleTriangularNumber {
    private static final int DIVISOR_TARGET = 500;
    private static Map<Integer, List<Integer>> DIVISOR_MAP = new HashMap<>();

    public static void main(String[] args) {
        int divisorCount = 0;

        int previousSum = 0;
        int i = 1;
        while (divisorCount < DIVISOR_TARGET + 1) {
            int sum = previousSum + i;
            divisorCount = calcDivisors(sum);
            System.out.println("Triangle num[" + i + "] = " + sum + " = " + previousSum + " + " + i);
            System.out.println("Triangle num[" + i + "] divisor count = " + divisorCount + " : " + DIVISOR_MAP.get(sum));
            previousSum += i;
            i++;
        }

        System.out.println("Triangle num[" + i + "] has a divisor count of " + divisorCount);
    }

    private static int calcDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();

        // Factors come in pairs, calc until sqrt and add pairs.
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {

                // Prevents duplicate numbers being added
                if (num / i == i) {
                    divisors.add(i);
                } else {
                    divisors.add(i);
                    divisors.add(num / i);
                }
            }
        }

        DIVISOR_MAP.put(num, divisors);

        return divisors.size();
    }
}
