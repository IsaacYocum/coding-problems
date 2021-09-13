package utils;

import java.util.ArrayList;

public class PrimeNumbersUtil {

    /**
     * Calculates a list of prime numbers @param numPrimesToGet long.
     * @param numPrimesToGet The length of the list of prime numbers to return.
     * @return A list of prime numbers @param numPrimesToGet long.
     */
    public static ArrayList<Integer> calcPrimes(int numPrimesToGet) {
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        for (int i = 2; i < numPrimesToGet; i++) {
            boolean primeCandidate = true;

            if (i < 10) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primeCandidate = false;
                        break;
                    }
                }
            } else {
                // while i > 9, if divisible by anything between 1-9, not a prime
                for (int j = 2; j < 10; j++) {
                    if (i % j == 0) {
                        primeCandidate = false;
                        break;
                    }
                }
            }

            if (primeCandidate) {
                listOfPrimeFactors.add(i);
            }
        }

        return listOfPrimeFactors;
    }

    /**
     * Calculates all prime numbers <= the specified limit.
     *
     * @param numPrimesToGet The upper limit of possible prime numbers to return.
     * @return A list of prime numbers <= @param limit.
     */
    public static ArrayList<Integer> getNPrimeNumbers(int numPrimesToGet) {
        return calcPrimes(numPrimesToGet);
    }

    /**
     * Retrieves the nth prime number.
     *
     * @param nthPrimeNum The nth prime position.
     * @return Returns the nth prime number.
     */
    public static int getNthPrimeNumber(int nthPrimeNum) {
        return calcPrimes(nthPrimeNum).get(nthPrimeNum);
    }
}
