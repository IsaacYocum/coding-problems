package problems.projectEuler._1_10;

public class _9_SpecialPythagoreanTriplet {
    private static final int SUM_TARGET = 1000;

    public static void main(String[] args) {
        int a, b, c;
        int aSquared, bSquared, cSquared;

        for (int i = 1; i < 10000000; i++) {
            for (int j = 1; j < 10000000; j++) {
                a = i;
                b = j;

                aSquared = a * a;
                bSquared = b * b;
                cSquared = aSquared + bSquared;

                if (Math.sqrt(cSquared) % 1.0 == 0) {
                    c = (int) Math.sqrt(cSquared);

                    int abcSum = a + b + c;
                    int abcProduct = a * b * c;

                    if (abcSum > SUM_TARGET) {
                        break;
                    }

                    if (aSquared + bSquared == cSquared && a + b + c == SUM_TARGET) {
                        System.out.println("\nThe sum target of " + SUM_TARGET + " has been found!");
                        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
                        System.out.println("The product of abc is: " + a + " * " + b + " * " + c + " = " + (abcProduct));
                    }
                }
            }
        }
    }
}
