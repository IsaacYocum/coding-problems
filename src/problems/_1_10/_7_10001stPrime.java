package problems._1_10;

import utils.PrimeNumbersUtil;

public class _7_10001stPrime {
    public static void main(String[] args) {
        int target = 10001;
        int primeNum = PrimeNumbersUtil.getNthPrimeNumber(target);
        System.out.println("The " + target + " prime number is: " + primeNum);
    }
}
