import java.util.Locale;
import java.util.Scanner;

public class bee1051{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double tax;


        if (salary <= 2000){
            tax = 0;
        }else if (salary > 2000 && salary <= 3000){
            tax = (salary - 2000) * 0.08;
        } else if (salary > 3000 && salary <= 4500){
            tax = 80 + (salary - 3000) * 0.18;
        } else{
            tax = 80 + 270 + (salary - 4500) * 0.28;
        }

        if (tax != 0){
            System.out.printf("R$ %.2f", tax);
            System.out.println();
        }else{
            System.out.println("Isento");
        }

        sc.close();
    }
}