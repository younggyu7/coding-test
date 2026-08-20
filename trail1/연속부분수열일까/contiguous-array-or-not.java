import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean seq = true;
        for (int i = 0; i < n1; i++) {
            seq = true;
            for (int j = 0; j < n2; j++) {
                if (i + j < n1) {
                    if (arr1[i + j] == arr2[j]) {
                        continue;
                    }
                    else seq = false;
                }
                else {
                    seq = false;
                    break;
                }
            }
            if (seq) break;
        }
        if (seq) System.out.println("Yes");
        else System.out.println("No");
    }
}