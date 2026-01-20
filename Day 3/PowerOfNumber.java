import java.util.Scanner;;

public class PowerOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base =sc.nextInt();
        System.out.print("Enter the power : ");
        int power =sc.nextInt();

        int box =1;
        if(power ==0){
            System.out.println(box);
        }
        if(power<0){
            base=1/base;
            power=-(power);
        }
        while (power!=0) {
            box=box*base;
            power --;

            
        }
        System.out.println(box);
        sc.close();
    }
}
