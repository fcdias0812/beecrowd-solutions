import java.util.Locale;
import java.util.Scanner;

public class bee1002 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double R = sc.nextDouble();
        double A = n * Math.pow(R, 2);

        System.out.printf("A=%.4f", A);
        System.out.println();
    }
}
