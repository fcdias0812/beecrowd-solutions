import java.util.Scanner;

public class bee1046 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int duracao;

        if (Y > X){
            duracao = Y - X;
        } else{
            duracao = (24 - X) + Y;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        System.out.println();

        sc.close();
    }
}
