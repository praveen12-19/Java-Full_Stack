public class MissingusingXOR {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int N=5;
        int xor1=0,xor2=0;
        for(int i=0;i<N-1;i++){
            xor1=xor1^(i+1);
            xor2=xor2^a[i];

        }
        xor1=xor1^N;
        System.out.println(xor1^xor2);
    }
}
