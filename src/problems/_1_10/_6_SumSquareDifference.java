package problems._1_10;

public class _6_SumSquareDifference {
    public static void main(String[] args) {
        int limit = 100;

        int sumOfSquare = sumOfSquaresUntil(limit);
        int squareOfSum = squareOfSumUntil(limit);
        int sumSquareDifference = squareOfSum - sumOfSquare;

        System.out.println("The sum of squares until " + limit + " = " + sumOfSquare);
        System.out.println("The square of sum until " + limit + " = " + squareOfSum);
        System.out.println("The sum square difference: " + squareOfSum + " - " + sumOfSquare + " = " + sumSquareDifference);
    }

    private static int sumOfSquaresUntil(int limit) {
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i * i;
        }

        return sum;
    }

    private static int squareOfSumUntil(int limit) {
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        return sum * sum;
    }
}
