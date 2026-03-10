import java.util.Locale;
import java.util.Scanner;

public class bee1118 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int question = 0;
        int counter;
        double score1;
        double score2;
        double average;

        while(question !=2){
            question = 0;
            score1 = 0;
            score2 = 0;
            counter = 0;

            while(counter < 1){
                score1 = sc.nextDouble();

                if(score1 < 0 || score2 > 10){
                    System.out.println("nota invalida");
                }else{
                    counter += 1;
                }
            }

            while(counter < 2){
                score2 = sc.nextDouble();

                if(score2 < 0 || score2 > 10){
                    System.out.println("nota invalida");
                }else{
                    counter += 2;
                }
            }

            average = (score1 + score2) / 2;

            System.out.printf("media = %.2f%n", average);

            while(question < 1 || question > 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                question = sc.nextInt();
            }
        }

        sc.close();
    }
}
