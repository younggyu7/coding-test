import java.util.Scanner;

public class Main {
    public static int scoreMax(int n, int[] a, int[] b, int[] c) {
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            int tmp = tryMix(i, n, a, b, c);
            if (tmp > max) max = tmp;
        }   
        return max;
    }
    public static int tryMix(int s, int n, int[] a, int[] b, int[] c) {
        int pos = s;
        int [] ps = new int[4];
        ps[pos] = 1;
        int cnt = 0;
        for (int i = 0 ; i < n; i++) {
            int tmp = ps[a[i]];
            ps[a[i]] = ps[b[i]];
            ps[b[i]] = tmp;
            if (ps[c[i]] == 1) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int ans = scoreMax(n, a, b, c);
        System.out.println(ans);
    }
}