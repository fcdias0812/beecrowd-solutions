import java.util.Locale;
import java.util.Scanner;

public class bee1040 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double N5;

        double average = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (2 + 3 + 4 + 1);
        average = Math.floor(average * 10) / 10;

        if (average >= 7) {
            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno aprovado.");
        } else if (average < 5){
            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno reprovado.");
        } else {
            N5 = sc.nextDouble();
            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f%n", N5);
            if (N5 >= 5){
                System.out.println("Aluno aprovado.");
            } else{
                System.out.println("Aluno reprovado.");
            }
            average = (average + N5) / 2;
            System.out.printf("Media final: %.1f", average);
            System.out.println();
        }

        sc.close();
    }
}
