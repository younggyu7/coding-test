import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = 1;
        System.out.print(a0 + " " + a1+ " ");
        while(true) {
            int sum = a1 + a0;
            System.out.print(sum + " ");
            a0 = a1;
            a1 = sum;
            if (sum > 100) break;
        }
    }
}