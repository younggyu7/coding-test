import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        while (true) {
            int tmp = sc.nextInt();
            if (tmp == 0) break;
            tmp /= 10;
            arr[tmp]++;
        }
        for (int i = 10; i > 0; i--) {
            System.out.println((i * 10) + " - " + arr[i]);
        }
    }
}