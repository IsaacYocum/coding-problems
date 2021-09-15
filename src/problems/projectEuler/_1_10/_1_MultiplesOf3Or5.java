package problems.projectEuler._1_10;

public class _1_MultiplesOf3Or5 {
    public static void main(String[] args) {
        multiplesOf3Or5();
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
}
