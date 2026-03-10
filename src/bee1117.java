import java.util.Locale;
import java.util.Scanner;

public class bee1117 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double score1 = sc.nextDouble();
        int counter = 0;

        while(counter <= 1){
            if (score1 < 0 || score1 > 10){
                System.out.println("nota invalida");
                score1 = sc.nextDouble();
                continue;
            }else{
                counter += 1;
            }
        }

        double score2 = sc.nextDouble();

        while(counter <= 2){
            if (score2 < 0 || score2 > 10){
                System.out.println("nota invalida");
                score2 = sc.nextDouble();
                continue;
            }else{
                counter += 1;
            }
        }

        double media = (score1 + score2) / 2.0;

        System.out.printf("media = %.2f", media);
        System.out.println();

        sc.close();
    }
}
