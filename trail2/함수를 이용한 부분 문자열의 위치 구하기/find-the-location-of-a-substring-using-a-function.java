import java.util.Scanner;
public class Main {
    public static String text;
    public static String pattern;

    public static boolean isSubString(int start) {
        for (int i = 0; i < pattern.length(); i++) {
            if (text.charAt(start + i) != pattern.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        int answer = -1;
        for (int i = 0 ; i <= text.length() - pattern.length(); i++) {
            if(isSubString(i)) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}