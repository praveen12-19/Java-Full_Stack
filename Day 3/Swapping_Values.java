public class Swapping_Values {
    public static void main(String[] args) {
        int a = 20,b = 30;
    //  int temp =a;
    //  a=b;
    //  b=temp;
    //  System.out.println(a+ " " +b);

 
        //without 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ " " +b);

    }
}
