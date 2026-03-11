import java.util.Scanner;

public class bee1078 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(2 > N || N > 1000){
            System.out.println("Número inválido!");
            return;
        }

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", i, N, i * N);
        }

        sc.close();
    }
}
