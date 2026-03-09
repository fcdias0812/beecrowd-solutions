import java.util.Scanner;

public class bee1049 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String word3 = sc.nextLine();

        switch (word1){
            case "vertebrado":
                switch (word2){
                    case "ave":
                        switch (word3){
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                            default:
                                System.out.println("Terceira palavra inexistente!");
                                break;
                        }
                        break;
                    case "mamifero":
                        switch (word3){
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                            default:
                                System.out.println("Terceira palavra inexistente!");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Segunda palavra inexistente!");
                        break;
                }
                break;
            case "invertebrado":
                switch (word2){
                    case "inseto":
                        switch (word3){
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                            default:
                                System.out.println("Terceira palavra inexistente!");
                                break;
                        }
                        break;
                    case "anelideo":
                        switch (word3){
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                            default:
                                System.out.println("Terceira palavra inexistente!");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Segunda palavra inexistente!");
                        break;
                }
                break;
            default:
                System.out.println("Primeira palavra inexistente!");
                break;
        }

        sc.close();
    }
}
