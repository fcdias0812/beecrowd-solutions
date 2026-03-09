import java.util.Scanner;

public class bee1047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        int hourDuration;
        int minuteDuration;
        int totalMinutes;

        totalMinutes = (endHour * 60 + endMinute) - (startHour * 60 + startMinute);

        if (totalMinutes <= 0){
            totalMinutes += 24 * 60;
        }

        hourDuration = totalMinutes / 60;
        minuteDuration = totalMinutes % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hourDuration, minuteDuration);
        System.out.println();

        sc.close();
    }
}
