public class Frequency_of_number {
    public static void main(String[] args) {
        int a[] = { 1, 6, 3, 1, 3, 5, 6, 7, 3, 2, 2, 1, 4 };
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > MAX) {
                MAX = a[i];
            }
        }
        int dp[] = new int[MAX + 1];
        for (int i = 0; i < a.length; i++) {
            dp[a[i]]++;
        }
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > 0) {
                System.out.println(i + " " + dp[i]);
            }
        }
    }

}
