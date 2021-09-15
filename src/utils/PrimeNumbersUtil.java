package utils;

import java.util.ArrayList;

public class PrimeNumbersUtil {

    public static ArrayList<Integer> getPrimesUntil(int numToStopAt) {
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();
        listOfPrimeFactors.add(2);

        int i = 3;
        while (listOfPrimeFactors.get(listOfPrimeFactors.size() - 1) < numToStopAt) {
            if (isPrime(i)) {
                listOfPrimeFactors.add(i);
            }

            i++;
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
        return calcNPrimes(numPrimesToGet);
    }

    /**
     * Retrieves the nth prime number.
     *
     * @param nthPrimeNum The nth prime position.
     * @return Returns the nth prime number.
     */
    public static int getNthPrimeNumber(int nthPrimeNum) {
        return calcNPrimes(nthPrimeNum).get(nthPrimeNum);
    }

    /**
     * Calculates a list of prime numbers @param numPrimesToGet long.
     *
     * @param numPrimesToGet The length of the list of prime numbers to return.
     * @return A list of prime numbers @param numPrimesToGet long.
     */
    private static ArrayList<Integer> calcNPrimes(int numPrimesToGet) {
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        int i = 0;
        while (listOfPrimeFactors.size() < numPrimesToGet) {
            if (isPrime(i)) {
                listOfPrimeFactors.add(i);
            }

            i++;
        }

        return listOfPrimeFactors;
    }

    private static boolean isPrime(int primeCandidate) {
        if (primeCandidate <= 1) {
            return false;
        }

        if (primeCandidate == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(primeCandidate) + 1; i++) {
            if (primeCandidate % i == 0) {
                return false;
            }
        }

        return true;
    }
}
