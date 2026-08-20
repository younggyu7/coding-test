import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                char tmp = sc.next().charAt(0);
                tmp += ('A' -'a');
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }
}