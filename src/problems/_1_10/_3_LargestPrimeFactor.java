package problems._1_10;

import utils.PrimeNumbersUtil;

import java.util.ArrayList;

public class _3_LargestPrimeFactor {
    public static void main(String[] args) {
        long target = 600851475143L;
        ArrayList<Integer> primeNumbersUntil100 = PrimeNumbersUtil.getPrimeNumbersUntil(10000);

        System.out.println(primeNumbersUntil100);

        ArrayList<Integer> numsTargetIsDivisibleBy = new ArrayList<>();

        for (int i = primeNumbersUntil100.size() - 1; i > 0; i--) {
            if (target % primeNumbersUntil100.get(i) == 0) {
                numsTargetIsDivisibleBy.add(primeNumbersUntil100.get(i));
                target /= primeNumbersUntil100.get(i);
            }
        }

        System.out.println("Prime factors = " + numsTargetIsDivisibleBy);
        System.out.println(target);
    }
}
