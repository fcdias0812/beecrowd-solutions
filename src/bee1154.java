import java.util.Locale;
import java.util.Scanner;

public class bee1154 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int counter = 0;
        int sum = 0;

        while(age > 0){
            counter += 1;
            sum += age;

            age = sc.nextInt();
        }

        double average = (double) sum / counter;

        System.out.printf("%.2f", average);
        System.out.println();
        sc.close();
    }
}
