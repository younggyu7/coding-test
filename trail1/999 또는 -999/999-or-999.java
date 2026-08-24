import java.util.Scanner;

public class Main {
    static final int INT_MAX = Integer.MAX_VALUE;
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = INT_MIN;
        int min = INT_MAX;
        while (true) {
            int tmp = sc.nextInt(); 
            if (tmp == 999 || tmp == -999) break;
            if (tmp > max) max = tmp;
            if (tmp < min) min = tmp;
        }
        System.out.println(max + " " + min);
        
    }
}