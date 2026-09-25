import java.util.Scanner;
public class Main {
    public static void acsArray(int a, int n) {
        if (a > n) return;
        System.out.print(a + " ");
        a++;
        acsArray(a ,n);
    }
    public static void decArray(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        n--;
        decArray(n); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        acsArray(1, n);
        System.out.println();
        decArray(n);
    }
}