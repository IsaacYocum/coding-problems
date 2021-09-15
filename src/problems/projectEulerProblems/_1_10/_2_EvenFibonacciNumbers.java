package problems.projectEulerProblems._1_10;

import java.util.ArrayList;

public class _2_EvenFibonacciNumbers {
    public static void main(String[] args) {
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

}
