import java.util.Scanner;

public class Main {
    static final int INT_MIN = Integer.MIN_VALUE;
    static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int answer = 0;
        int min = INT_MAX;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) min = arr[i];
            if (arr[i] - min > answer) answer = arr[i] - min;
        }
        System.out.println(answer);
    }
}