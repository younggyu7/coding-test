import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 3; i++) {
            char Symtom = sc.next().charAt(0);
            int tmpt = sc.nextInt();
            if (Symtom == 'Y' && tmpt >= 37) arr[0]++;
            else if (Symtom == 'N' && tmpt >= 37) arr[1] ++;
            else if (Symtom == 'Y' && tmpt < 37) arr[2]++;
            else arr[3]++;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        if(arr[0] >= 2) System.out.print("E");
    }
}