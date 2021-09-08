package problems._1_10;

import java.util.ArrayList;

public class _3_LargestPrimeFactor {
    public static void main(String[] args) {
        long target = 600851475143L;
        ArrayList<Integer> primeNumbersUntil100 = getPrimeNumbersUntil(10000);

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

    /**
     * Calculates all prime numbers <= the specified limit.
     * @param limit The upper limit of possible prime numbers to return.
     * @return A list of prime numbers <= @param limit.
     */
    public static ArrayList<Integer> getPrimeNumbersUntil(int limit) {

        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        for (int i = 1; i < limit; i++) {
            boolean primeCandidate = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeCandidate = false;
                    break;
                }
            }

            if (primeCandidate) {
                listOfPrimeFactors.add(i);
            }
        }

        return listOfPrimeFactors;
    }
}
