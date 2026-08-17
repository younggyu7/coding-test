import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            double tmp = sc.nextDouble();
            sum += tmp;
            cnt++;
        }
        double avg = sum / cnt;
        System.out.printf("%.1f", avg);
        System.out.println();
        if (avg >= 4.0) System.out.println("Perfect");
        else if (avg >= 3.0) System.out.println("Good");
        else System.out.println("Poor");
    }
}