import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_m = sc.nextInt();
        int a_e = sc.nextInt();
        int b_m = sc.nextInt();
        int b_e = sc.nextInt();
        
        if (a_m > b_m) System.out.println("A");
        else if ( a_m == b_m) {
            if ( a_e > b_e) System.out.println("A");
            else System.out.println("B");
        }
        else System.out.println("B");
    }
}