package problems.projectEuler._11_20;

import java.util.ArrayList;
import java.util.List;

public class _12_HighlyDivisibleTriangularNumber {
    private static final int DIVISOR_TARGET = 500;

    public static void main(String[] args) {
        int divisorCount = 0;
        List<Integer> divisors = new ArrayList<>();

        int previousSum = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Triangle num[" + i + "] = " + previousSum + " + " + i);
            previousSum += i;
        }
    }
}
