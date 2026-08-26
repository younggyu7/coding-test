import java.util.Scanner;
public class Main {
    public static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        return false;
    }
    public static boolean isMagic(int n) {
        int tmp = n / 10 + n % 10;
        if (isEven(n)) {
            if (tmp % 5 == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isMagic(n)) System.out.println("Yes");
        else System.out.println("No");
    }
}