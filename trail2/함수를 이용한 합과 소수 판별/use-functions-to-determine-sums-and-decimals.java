import java.util.Scanner;
public class Main {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int numSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
    public static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        return false;
    }
    public static int isNum(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if(isPrime(i) && isEven(numSum(i))) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = isNum(a, b);
        System.out.println(ans);
    }
}