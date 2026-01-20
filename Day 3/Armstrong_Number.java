import java.util.Scanner;
public class Armstrong_Number{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;

        while (dup != 0) {
            int rem=dup%10;
            sum = sum +(int)Math.pow(rem,3);
            dup = dup/10;
        }
        if(num == sum){
            System.out.println(num +" is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }
}
