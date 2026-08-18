import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int tmp = sc.nextInt();
            if (tmp == 0) break;
            if (tmp % 2 == 0) System.out.print((tmp / 2) + " ");
            else System.out.print((tmp + 3) + " ");
        }
    }
}