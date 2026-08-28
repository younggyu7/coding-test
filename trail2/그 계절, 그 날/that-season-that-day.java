import java.util.Scanner;
public class Main {
    public static boolean leapYear(int y) {
        if (y % 4 == 0) {
            if( y % 100 == 0) {
                if ( y % 400 == 0) return false;
                else return true;
            }
            else return false;
        }
        else return true;
    }
    public static int lastDayNumber(int y, int m) {
        if(leapYear(y)) {
            if (m == 2) return 28;
        }
        else {
            if (m == 2) return 29;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        else return 31;
    }
    public static boolean isDay (int y, int m, int d) {
        if (m <= 12 && d <= lastDayNumber(y, m)) {
            return true;
        }
        else return false;
    }
    public static String isSeason(int m) {
        if (m >=3 && m <= 5) return "Spring";
        else if (m >=6 && m <= 8) return "Summer";
        else if (m >=9 && m <= 11) return "Fall";
        else  return "Winter";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isDay(y, m, d)) {
            System.out.println(isSeason(m));
        }
        else System.out.println(-1);
    }
}