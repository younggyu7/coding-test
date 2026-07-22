import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();
        
        if (age >= 19) {
            if (sex == 1) System.out.println("WOMAN");
            else System.out.println("MAN");
        }
        else {
            if (sex == 1) System.out.println("GIRL");
            else System.out.println("BOY");
        }
    }
}