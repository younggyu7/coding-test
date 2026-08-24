import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = INT_MAX;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) min = arr[i];
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) cnt++;
        }
        System.out.println(min + " " + cnt);
    }
}