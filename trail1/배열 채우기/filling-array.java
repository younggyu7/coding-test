import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int idx = 9;
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0) {
                idx = i;
                break;
            }
            arr[i] = tmp;
        }
        if (idx == 9) {
            for (int i = idx; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            for (int i = idx - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}