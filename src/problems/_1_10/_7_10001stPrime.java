package problems._1_10;

import utils.PrimeNumbersUtil;

public class _7_10001stPrime {
    public static void main(String[] args) {
        int primeNum = PrimeNumbersUtil.getNthPrimeNumber(10001);
        System.out.println("The 10001st prime number is: " + primeNum);
    }
}
