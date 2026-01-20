public class Ex_nestedif {
    public static void main(String[] args) {
        int percentage=50;
        boolean hasHallticket=true;
        if(hasHallticket){
            if(percentage>=60){
                System.out.println("eligible to write exam");
            }
            else{
                System.out.println("pay fine amount");
            }  
        }
        else{
            System.out.println("not eligible to write exam");
        }  
    }  
}