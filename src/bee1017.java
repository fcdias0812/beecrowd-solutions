import java.util.Locale;
import java.util.Scanner;

public class bee1017 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int spentTime = sc.nextInt();
        int avarageSpeed = sc.nextInt();
        double litersNeeded = (double) spentTime * avarageSpeed / 12;

        System.out.printf("%.3f", litersNeeded);
        System.out.println();

        sc.close();
    }
}
