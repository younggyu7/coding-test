import java.util.Scanner;
public class Main {
    public static void printStar(int a, int n) {
        if(a > n) return;
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        a++;
        printStar(a, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        printStar(a, n);
    }
}