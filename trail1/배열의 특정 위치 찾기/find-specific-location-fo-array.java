import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int evenSum = 0;
        int thirdSum = 0;
        int thirdCnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if ( i % 2 == 1) {
                evenSum += arr[i];
            }
            if ( (i + 1) % 3 == 0) {
                thirdSum += arr[i];
                thirdCnt++;
            }
        }
        double avg = (double)thirdSum / thirdCnt;
        System.out.print(evenSum + " ");
        System.out.printf("%.1f", avg);
    }
}