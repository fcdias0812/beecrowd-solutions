import java.util.Locale;
import java.util.Scanner;

public class bee1045 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double aux;

        if (A < B){
            aux = A;
            A = B;
            B = aux;
        }

        if (B < C){
            aux = B;
            B = C;
            C = aux;
        }

        if (A < B){
            aux = A;
            A = B;
            B = aux;
        }

        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO RETANGULO");
        }

        if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (A == B && A == C){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || A == C || B == C){
            System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();
    }
}
