import java.util.Locale;
import java.util.Scanner;

public class bee1006 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        int weightA = 2;
        int weightB = 3;
        int weightC = 5;

        double media = (A * weightA + B * weightB + C * weightC) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f", media);
        System.out.println();

        sc.close();
    }
}
