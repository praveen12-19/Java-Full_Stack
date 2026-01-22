import java.util.Scanner;

public class Array_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
