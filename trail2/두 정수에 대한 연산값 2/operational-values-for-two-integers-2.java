import java.util.Scanner;
class InWrapper{
    int value;

    public InWrapper(int value) {
        this.value = value;
    }
}
public class Main {
    public static void plusTen(InWrapper a) {
        a.value += 10;
    }
    public static void multiTwice(InWrapper b) {
        b.value *= 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        InWrapper a1 = new InWrapper(a);
        InWrapper b1 = new InWrapper(b);
        if (a > b) {
            plusTen(b1);
            multiTwice(a1);
        }
        else {
            plusTen(a1);
            multiTwice(b1);
        }
        System.out.println(a1.value + " " + b1.value);
    }
}