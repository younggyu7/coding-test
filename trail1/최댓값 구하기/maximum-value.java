import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        if (a > b) {
            if (c > a) max = c;
            else max = a;
        }
        else {
            if (c > b) max= c;
            else max = b;
        }
        System.out.println(max);
    }
}