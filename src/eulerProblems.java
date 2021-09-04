import java.math.BigInteger;
import java.util.ArrayList;

public class eulerProblems {
    public static void main(String[] args) {
//        multiplesOf3Or5();
//        evenFibonacciNumbers();
        largestPrimeFactor();
    }

    public static void multiplesOf3Or5() {
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);
    }

    public static void evenFibonacciNumbers() {
        int FourMil = 4000000;
        ArrayList<Integer> sequence = new ArrayList<>();

        int oldTerm = 1;
        int newTerm = 2;

        sequence.add(oldTerm);
        sequence.add(newTerm);

        int sum;

        int sumOfEven = 0;

        while (newTerm < FourMil) {
            sum = oldTerm + newTerm;
            oldTerm = newTerm;
            newTerm = sum;

            sequence.add(sum);
        }

        for (int term : sequence) {
            if (term % 2 == 0 && term < FourMil) {
                sumOfEven += term;
            }
        }

        System.out.println(sequence);
        System.out.println("Sum of even terms: " + sumOfEven);
    }

    public static void largestPrimeFactor() {
        long target = 600851475143L;


    }
}
