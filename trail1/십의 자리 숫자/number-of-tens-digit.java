import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        while(true) {
            int tmp = sc.nextInt();
            if (tmp == 0) break;
            tmp /= 10;
            arr[tmp]++;
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }
}