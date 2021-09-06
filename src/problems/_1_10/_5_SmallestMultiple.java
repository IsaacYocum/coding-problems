package problems._1_10;

public class _5_SmallestMultiple {
    public static void main(String[] args) {

        for (int i = 1; i < 1000000000; i++) {
            // Every number is divisible by at least 1
            int divisibleByCount = 0;

            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    divisibleByCount++;
//                    System.out.println(i + " is divisible by " + j);
                }
            }

//            System.out.println(i + " is divisible by " + divisibleByCount + " numbers.\n");

            if (divisibleByCount == 20) {
                System.out.println(i + " is divisible by numbers 1-20.");
                break;
            }
        }
    }
}
