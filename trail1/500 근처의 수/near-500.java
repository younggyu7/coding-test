import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 1000;
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            if (tmp < 500 && tmp > max) max = tmp;
            if (tmp > 500 && tmp < min) min = tmp;
        }
        System.out.println(max + " " + min);
    }
}