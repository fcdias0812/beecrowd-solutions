import java.util.Locale;
import java.util.Scanner;

public class bee1079 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double testCase1 = 0.0;
        double testCase2 = 0.0;
        double testCase3 = 0.0;
        double average = 0.0;

        for (int i = 0; i < N; i++) {
            testCase1 = sc.nextDouble();
            testCase2 = sc.nextDouble();
            testCase3 = sc.nextDouble();

            average = (testCase1 * 2 + testCase2 * 3 + testCase3 * 5) / (2 + 3 + 5);

            System.out.printf("%.1f%n", average);
        }

        sc.close();
    }
}
