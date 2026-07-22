import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt_a = 0;
        for (int i = 0 ; i < 3; i++) {
            int sym = sc.next().charAt(0);
            int tmp = sc.nextInt();
            if (sym == 'Y' && tmp >= 37) cnt_a++;
        }
        if (cnt_a >= 2) System.out.println("E");
        else System.out.println("N");


    }
}