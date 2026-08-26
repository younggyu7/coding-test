import java.util.Scanner;

public class Main {
    public static int minValue(int a, int b, int c) {
        int min = 0;
        min  = Math.min(a, Math.min(b, c));
        return min;      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = minValue(a, b, c);
        System.out.println(answer);
    }
}