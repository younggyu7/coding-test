import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int qt = sc.nextInt();
            if (qt == 1) {
                int seq = sc.nextInt();
                System.out.println(arr[seq - 1]);
            }
            else if (qt == 2) {
                int tmp = sc.nextInt();
                int idx = -1;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == tmp) {
                        idx = j + 1;
                        break;
                    }
                }
                    if (idx == -1) System.out.println(0);
                    else System.out.println(idx);

            }
            else {
                int st = sc.nextInt();
                int ed = sc.nextInt();
                for (int j = st - 1; j < ed; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}