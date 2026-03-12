import java.util.Scanner;

public class bee1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X;
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            X = sc.nextInt();

            if (X >= 10 && X <= 20){
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("%d in%n", in);
        System.out.printf("%d out", out);

        System.out.println();
        sc.close();
    }
}
