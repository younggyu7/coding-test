import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = 0; j < 4; j++) {
                int tmp = sc.nextInt();
                sum += tmp;
            }
            if (sum >= 240) {
                System.out.println("pass");
                cnt++;
            }
            else System.out.println("fail");
        }
        System.out.println(cnt);
    }
}