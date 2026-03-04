import java.util.Locale;
import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employeesNumber = sc.nextInt();
        int workedHoursMonth = sc.nextInt();
        double amountReceivedHour = sc.nextDouble();

        System.out.printf(
                "NUMBER = %d%n" +
                        "SALARY = U$ %.2f", employeesNumber, (double) workedHoursMonth * amountReceivedHour
        );
        System.out.println();

        sc.close();
    }
}
