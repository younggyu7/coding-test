import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sumVal = 0;
        while (true) {
            int i = sc.nextInt();
            if (i >= 30 || i < 20) break;
            sumVal += i;
            cnt++;
        }
        System.out.printf("%.2f", (double)sumVal / cnt);
    }
}