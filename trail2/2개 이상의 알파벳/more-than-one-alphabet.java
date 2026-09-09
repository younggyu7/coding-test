import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int[] a = new int[26];
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            a[c-97]++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0) cnt++;
        }
        if(cnt > 1) System.out.println("Yes");
        else System.out.println("No");
    }
}