import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0) break;
            if (tmp % 2 == 0) {
                sum += tmp;
                cnt++;
            }
        }
        System.out.print(cnt + " " + sum);
    }
}