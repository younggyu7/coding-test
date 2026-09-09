import java.util.Scanner;

public class Main {
    public static int plusTwentyFive(int a) {
        return a + 25;
    }
    public static int multiTwice(int a) {
        return a * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            a = plusTwentyFive(a);
            b = multiTwice(b);
        }
        else {
            a = multiTwice(a);
            b = plusTwentyFive(b);
        }
        System.out.println(a + " " + b);
    }
}