import java.util.Scanner;

public class bee1001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(),
                B = sc.nextInt(),
                X = A + B;

        System.out.printf("X = %d", X);
        System.out.println();

        sc.close();
    }
}
