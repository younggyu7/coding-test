import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int total_sum = 0;
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                total_sum += arr[i][j];
            }
            double avg_tmp = (double) sum / 4;
            System.out.printf("%.1f ", avg_tmp);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int tmp_sum = 0;
            for (int j = 0; j < 2; j++) {
                tmp_sum += arr[j][i];
            }
            double tmp_avg = (double) tmp_sum / 2;
            System.out.printf("%.1f ", tmp_avg);
        }
        System.out.println();
        double total_avg = (double) total_sum / 8;
        System.out.printf("%.1f", total_avg);
    }
}