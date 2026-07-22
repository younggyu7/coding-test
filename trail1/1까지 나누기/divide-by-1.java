import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int i = 1;
        while (true) {
            n /= i;
            i++;
            cnt++;
            if (n <= 1) break;
            
        }
        System.out.println(cnt);
    }
}