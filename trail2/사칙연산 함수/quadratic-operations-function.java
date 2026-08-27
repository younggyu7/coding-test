import java.util.Scanner;
public class Main {
    public static int multi(int a, int b) {
        int ans = a * b;
        return ans;
    }
    public static int divid(int a, int b) {
        int ans = a / b;
        return ans;
    }
    public static int plus(int a, int b) {
        int ans = a + b;
        return ans;
    }
    public static int minus(int a, int b) {
        int ans = a - b;
        return ans;
    }
    public static int choiceCircul(int a, int b, char o) {
        int ans = 0;
        if (o == '+') {
            ans = plus(a, b);
            return ans;
        }
        else if (o == '-') {
            ans = minus(a, b);
            return ans;
        }
        else if (o == '*') {
            ans = multi(a, b);
            return ans;
        }
        else if (o == '/') {
            ans = divid(a, b);
            return ans;
        }
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        int ans = choiceCircul(a, c, o);
        if (ans == -1) System.out.println("False");
        else {
            System.out.println(a + " " + o + " " + c + " = " + ans);
        }
        
    }
}