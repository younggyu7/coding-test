import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        if (tmp >= 100) System.out.println("vapor");
        else if (tmp >= 0) System.out.println("water");
        else System.out.println("ice");
    }
}