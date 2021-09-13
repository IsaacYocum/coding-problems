package problems._1_10;

import utils.PrimeNumbersUtil;

import java.util.ArrayList;

public class _10_SummationOfPrimes {
    private static final int NUM_PRIMES_LIST = 2000000;
    private static final ArrayList<Integer> PRIME_NUMBERS_LIST = PrimeNumbersUtil.getNPrimeNumbers(NUM_PRIMES_LIST);

    public static void main(String[] args) {
        int sum = 0;

        for (Integer primeNum : PRIME_NUMBERS_LIST) {
                sum += primeNum;
                System.out.println(primeNum);
        }

        System.out.println(sum);
    }
}
