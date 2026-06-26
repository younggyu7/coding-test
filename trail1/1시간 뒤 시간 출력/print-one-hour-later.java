import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split(":");
        int a= Integer.parseInt(strArr[0]) + 1;
        System.out.println(a + ":" + strArr[1]);
    }
}