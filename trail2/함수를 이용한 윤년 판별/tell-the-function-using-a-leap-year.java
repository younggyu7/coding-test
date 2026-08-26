import java.util.Scanner;

public class Main {
    public static boolean leapYear(int n) {
        if (n % 4  == 0) {
            if (n % 100 == 0 && n % 400 != 0) return false;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(leapYear(y)) System.out.println("true");
        else System.out.println("false");
    }
}