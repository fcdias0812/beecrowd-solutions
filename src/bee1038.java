import java.util.Locale;
import java.util.Scanner;

public class bee1038 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        double valor = 0.00;

        switch (X) {
            case 1:
                valor = Y * 4.00;
                System.out.print("Total: R$ ");
                break;
            case 2:
                valor = Y * 4.50;
                System.out.print("Total: R$ ");
                break;
            case 3:
                valor = Y * 5.00;
                System.out.print("Total: R$ ");
                break;
            case 4:
                valor = Y * 2.00;
                System.out.print("Total: R$ ");
                break;
            case 5:
                valor = Y * 1.50;
                System.out.print("Total: R$ ");
                break;
            default:
                System.out.println("Código inexistente!");
                break;
        }

        System.out.printf("%.2f", valor);
        System.out.println();

        sc.close();
    }
}
