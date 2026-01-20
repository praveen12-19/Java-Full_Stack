import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Table =sc.nextInt();

        int i=1;
        for(i=1;i<=10;i++){
            System.out.println(i + "x" + Table + "=" + i*Table);
        }
        sc.close();
            
    }
}