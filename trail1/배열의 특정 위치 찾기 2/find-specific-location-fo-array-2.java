import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            if (i % 2 == 0) oddSum += tmp;
            else evenSum += tmp;
        }
        if (oddSum > evenSum) System.out.println(oddSum - evenSum);
        else System.out.println(evenSum - oddSum);
    }
}