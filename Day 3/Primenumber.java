import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int div =2;
        boolean isPrime=true;

        while (div<=n/2) {
            if(n%div==0){
                isPrime=false;
                    break;
            }
            div++;
            
        }
        if(isPrime){
            System.out.println(n + "is a Prime number");
        }
        else{
            System.out.println(n + " is Not a Prime number");
        }
        sc.close();

    }
}
