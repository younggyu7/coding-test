import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int primeSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = primeSum(a, b);
        System.out.println(answer);
    }
}