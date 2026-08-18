import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int a0 = n;
        while(true) {
            if (cnt > 1) break;
            if (a0 % 5 == 0) cnt++;
            System.out.print(a0 + " ");
            a0 += n;
        }
    }
}