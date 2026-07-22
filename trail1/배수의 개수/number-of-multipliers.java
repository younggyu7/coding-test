import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt_3 = 0;
        int cnt_5 = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 3 == 0) cnt_3++;
            if (n % 5 == 0) cnt_5++;
        }
        System.out.println(cnt_3 + " " + cnt_5);
    }
}