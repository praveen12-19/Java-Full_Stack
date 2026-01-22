public class Product_of_Array {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 1, 2, 3 };

        int max = Math.max(a.length, b.length);

        for (int i = 0; i < max; i++) {
            if (i < a.length && i < b.length) {
                System.out.print(a[i] * b[i] + " ");
            } else if (i < a.length) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(b[i] + " ");
            }
        }

    }
}