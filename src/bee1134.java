import java.util.Scanner;

public class bee1134 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int fuel = 0;
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        while (fuel != 4){
            fuel = sc.nextInt();

            if (fuel < 1 || fuel > 4){
                continue;
            }else if (fuel == 1){
                alcohol += 1;
            }else if (fuel == 2){
                gasoline += 1;
            }else if (fuel == 3){
                diesel += 1;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcohol);
        System.out.printf("Gasolina: %d%n", gasoline);
        System.out.printf("Diesel: %d", diesel);

        System.out.println();
        sc.close();
    }
}
