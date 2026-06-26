import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] parts = s.split("\\.");
        System.out.println(parts[1] + "-" + parts[2] + "-" + parts[0]);
    }
}