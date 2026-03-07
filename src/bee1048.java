import java.util.Locale;
import java.util.Scanner;

public class bee1048 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double newSalary;
        double moneyEarned;
        int inPercentage;

        if (salary <= 400.00){
            inPercentage = 15;
        } else if (salary > 400.00 && salary <= 800.00){
            inPercentage = 12;
        } else if (salary > 800.00 && salary <= 1200.00){
            inPercentage = 10;
        } else if (salary > 1200.00 && salary <= 2000.00){
            inPercentage = 7;
        } else{
            inPercentage = 4;
        }

        moneyEarned = salary * (inPercentage / (double) 100);
        newSalary = salary + (salary * (inPercentage / (double) 100));

        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
        System.out.printf("Em percentual: %d ", inPercentage);
        System.out.println("%");

        sc.close();
    }
}
