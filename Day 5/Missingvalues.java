public class Missingvalues {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int N=5;
        int sum = N*(N+1)/2;
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1 +=a[i];
        }   
        System.out.println(sum-sum1);     
    }
}
