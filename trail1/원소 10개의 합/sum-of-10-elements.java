import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
        }
        System.out.println(sum);
    }
}