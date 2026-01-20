public class LCM_Finding {
    public static void main(String[] args) {
        int a=12,b=18;
        int n=a*b;
        while (b!=0) 
        {
            int temp = a ;
            b = a % b ;
            a=temp;            
        }
        System.out.println("gcd = " + a);
        System.out.println("Lcm = " + n/a);
    }
}
