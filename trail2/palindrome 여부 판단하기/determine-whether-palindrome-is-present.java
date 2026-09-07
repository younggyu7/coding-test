import java.util.Scanner;
public class Main {
    public static boolean isPalin(String s) {
        char[] tmp = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n / 2; i ++) {
            char tmp1 = tmp[i];
            tmp[i] = tmp[n - i - 1];
            tmp[n - i - 1] = tmp1;
        }
         String reversed = new String(tmp);
         
        if (s.equals(reversed)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(isPalin(input)) System.out.println("Yes");
        else System.out.println("No");

    }
}