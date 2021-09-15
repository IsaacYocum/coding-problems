package problems.otherProblems;

public class fizzbuzz {
    // For each multiple of 3, print "Fizz"
    // For each multiple of 5, print "Buzz"
    // Fer each multiple of 3 AND 5, print "FizzBuzz"

    public static void main(String[] args) {
        int limit = 100;
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }

            if (i % 5 == 0) {
                System.out.print("Buzz");
            }

            if (i % 3 != 0 && i % 5 != 0){
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
