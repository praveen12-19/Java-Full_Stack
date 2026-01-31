import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // String p ="";
        // for(int i =s.length()-1;i>=0;i--){
        //     p =p+s.charAt(i);
        // }
        // System.out.println(p);
        
        char[] c=s.toCharArray();
        int st=0,end=s.length()-1;
        while (st<end) {
            char temp=c[st];
            c[st]=c[end];
            c[end] = temp;
            st++;end--;  
        }
        System.out.println(new String(c));
        sc.close();
    }
}
