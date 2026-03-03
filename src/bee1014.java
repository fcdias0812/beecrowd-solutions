import java.util.Locale;
import java.util.Scanner;

public class bee1014 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double avarageConsumption = X / Y;

        System.out.printf("%.3f km/l", avarageConsumption);
        System.out.println();

        sc.close();
    }
}
