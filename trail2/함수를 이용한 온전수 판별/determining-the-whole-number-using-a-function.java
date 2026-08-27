import java.util.Scanner;
public class Main {
    public static boolean cond1(int a) {
        if (a % 2 == 0) return false;
        return true;
    }
    public static boolean cond2(int a) {
        int tmp = a % 10;
        if (tmp == 5) return false;
        return true;
    }
    public static boolean cond3(int a) {
        if (a % 3 == 0 && a % 9 !=0) return false;
        return true;
    }
    public static int pftNum(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if(cond1(i) && cond2(i) && cond3(i)) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = pftNum(a, b);
        System.out.println(ans);
    }
}