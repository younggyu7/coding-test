import java.util.Scanner;

public class Main {
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = n;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        while(cnt >= 1) {
            int idx = 0;
            int max = INT_MIN;
            for (int i = 0; i < cnt; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    idx = i;
                }
            }
            System.out.print((idx + 1) + " ");
            cnt = idx;
        }

    }
}