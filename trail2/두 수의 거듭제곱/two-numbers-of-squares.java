import java.util.Scanner;

public class Main {
    public static int multi(int a, int b) {
        int ans = (int) Math.pow(a,b);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int answer = multi(a, b);
        System.out.println(answer);
    }
}