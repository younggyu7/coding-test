public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int tmp1 = b;
        int tmp2 = c;
        b = a;
        c = tmp1;
        a = tmp2;
        System.out.print(a + "\n" + b + "\n" + c);
    }
}