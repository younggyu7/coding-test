import java.util.Scanner;

public class Main {
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = INT_MIN;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j <n; j++) {
                if (arr[i] == arr[j]) cnt++;
            }
            if (cnt == 1 && arr[i] > max) max = arr[i];
        }

        if (max == INT_MIN) System.out.println(-1);
        else System.out.println(max);

    }
}