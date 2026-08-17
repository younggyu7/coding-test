import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            if (tmp >= 250) {
                break;
            }
            sum += tmp;
            cnt++;
        }
        double avg = (double) sum / cnt;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}