package utils;

import java.util.ArrayList;

public class PrimeNumbersUtil {
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

    /**
     * Gets a list of prime numbers that is as long as @param numOfPrimeNums.
     * @param numOfPrimeNums The number of prime numbers that will be returned.
     * @return A list of prime numbers that is @params numOfPrimeNums long.
     */
    public static ArrayList<Integer> getThisManyPrimeNumbers(int numOfPrimeNums) {

        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        int i = 1;

        while (listOfPrimeFactors.size() < numOfPrimeNums) {
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

            i++;
        }

        return listOfPrimeFactors;
    }
}
