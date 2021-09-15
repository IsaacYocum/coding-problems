package problems._1_10;

import utils.PrimeNumbersUtil;

import java.util.ArrayList;

public class _10_SummationOfPrimes {
    private static final int PRIME_CAP = 2000000;
    private static final ArrayList<Integer> PRIME_NUMBERS_LIST = PrimeNumbersUtil.getPrimesUntil(PRIME_CAP);

    public static void main(String[] args) {
        int sum = 0;

        int finalPrime = PRIME_NUMBERS_LIST.get(PRIME_NUMBERS_LIST.size() - 1);

        int i = 0;
        while (PRIME_NUMBERS_LIST.get(i) < PRIME_CAP) {
                sum += PRIME_NUMBERS_LIST.get(i);
                System.out.println(PRIME_NUMBERS_LIST.get(i));
                i++;
        }

        System.out.println(sum);
    }
}
