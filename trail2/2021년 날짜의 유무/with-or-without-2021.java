import java.util.Scanner;
public class Main {
    public static boolean isDate(int m, int d) {
        if (m < 8) {
            if (m == 2) {
                if ( d > 28) return false;
            }
            else {
                if ( m % 2 == 0) {
                    if (d > 30) return false;
                }
                else {
                    if (d > 31) return false;
                }
            }
        }
        else if (m < 13 && m > 7) {
             if ( m % 2 == 0) {
                    if (d > 31) return false;
                }
            else {
                if (d > 30) return false;
            }
        }
        else return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(isDate(m, d)) System.out.println("Yes");
        else System.out.println("No");
    }
}