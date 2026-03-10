import java.util.Scanner;

public class bee1159 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int counter;
        int sum;

        while(X != 0){
            counter = 0;
            sum = 0;

            if(X % 2 != 0){
                X += 1;
            }

            while(counter < 5){
                sum += X;
                X += 2;
                counter += 1;
            }

            System.out.println(sum);
            X = sc.nextInt();
        }

        sc.close();
    }
}
