import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid;
        if (a > b) {
            if (c > a) mid = a;
            else {
                if (b > c) mid = b;
                else mid = c;
            }
        }
        else {
            if (c > b) mid= b;
            else {
                if (c > a) mid = c;
                else mid = a;
            }
        }
        System.out.println(mid);
    }
}