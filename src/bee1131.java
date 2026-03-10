import java.util.Scanner;

public class bee1131 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int question = 0;
        int counter = 0;
        int goalsInter;
        int goalsGremio;
        int inter = 0;
        int gremio = 0;
        int empates = 0;

        while(question != 2){
            question = 0;
            counter += 1;

            goalsInter = sc.nextInt();
            goalsGremio = sc.nextInt();

            if(goalsInter == goalsGremio){
                empates += 1;
            }else if(goalsInter > goalsGremio){
                inter += 1;
            }else{
                gremio += 1;
            }

            while(question < 1 || question > 2){
                System.out.println("Novo grenal (1-sim 2-nao)");
                question = sc.nextInt();
            }
        }

        System.out.printf("%d grenais%n", counter);
        System.out.printf("Inter:%d%n", inter);
        System.out.printf("Gremio:%d%n", gremio);
        System.out.printf("Empates:%d%n", empates);

        if(inter > gremio){
            System.out.println("Inter venceu mais");
        }else{
            System.out.println("Gremio venceu mais");
        }

        sc.close();
    }
}
