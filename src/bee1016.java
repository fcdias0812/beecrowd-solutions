import java.util.Scanner;

public class bee1016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int howLongItTakes = distance * 2;

        System.out.printf("%d minutos", howLongItTakes);
        System.out.println();

        sc.close();
    }
}
