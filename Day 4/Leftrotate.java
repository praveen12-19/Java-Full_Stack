import java.util.Scanner;
import java.util.Arrays;

public class Leftrotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {

            a[i] = sc.nextInt();
        }
        System.out.print("How many times to rotate : ");
        int k = sc.nextInt();
        if (k % size != 0) {
            for (int j = 0; j < k; j++) {
                int last = a[size - 1];
                for (int i = size - 1; i > 0; i--) {
                    a[i] = a[i - 1];
                }
                a[0] = last;

            }

        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}