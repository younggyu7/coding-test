import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int st  = 1;
        for (int d = 0; d < n + m -1; d++) {
            int row = Math.max(0, d -(m -1));
            int col  = d - row;
            while (row < n && col >= 0) {
                arr[row][col] = st;
                row++;
                col--;
                st++;
            }
        }
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}