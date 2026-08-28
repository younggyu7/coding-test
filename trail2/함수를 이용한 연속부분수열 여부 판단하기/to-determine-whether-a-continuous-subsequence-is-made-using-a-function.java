import java.util.Scanner;

public class Main {
    public static boolean isConti(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        for (int i = 0; i <= n1 - n2; i++) {
            boolean cont = true;
            for (int j = 0; j < n2; j++) {
                if (a[i + j] != b[j]) {
                    cont  = false;
                    break;
                }
            }
            if (cont) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        if(isConti(a, b)) System.out.println("Yes");
        else System.out.println("No");
    }
}