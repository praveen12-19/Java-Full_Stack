import java.util.Scanner;
import java.util.Arrays;

public class Swap_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int start = 0, end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
