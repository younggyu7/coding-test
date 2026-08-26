import java.util.Scanner;
public class Main {
    public static boolean isThird(int n) {
        if (n % 3 == 0) return true;
        return false;
    }
    public static boolean isMagic(int n) {
        String s = Integer.toString(n);
        if(s.contains("3") || s.contains("6") || s.contains("9") ) return true;
        return false;
    }
    public static int cntMagic(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if(isThird(i) || isMagic(i)) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int answer = cntMagic(A, B);
        System.out.println(answer);

    }
}