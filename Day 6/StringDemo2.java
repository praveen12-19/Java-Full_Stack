public class StringDemo2 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello");
        StringBuilder sb1=new StringBuilder("world");
        //sb1+="hello";
        
        //append - used to concatenate
        sb1.append(" hello ");
        System.out.println(sb1);

        //Convert string builder into string
        String s1=new String(sb1);
        System.out.println(sb1.toString());

        //insert()
        StringBuilder sb2 = new StringBuilder("welcome");
        sb2.insert(0, "hello ");
        System.out.println(sb2);

        //reverse()
        StringBuilder sb3 = new StringBuilder("Praveen");
        System.out.println(sb3.reverse());

        //deletecharAt(index)
        StringBuilder sp1= new StringBuilder("Asuss");
        System.out.println(sp1.deleteCharAt(4));

        //replace
        System.out.println(sb3.replace(0, 4, "Hello "));
        
        //hash code
        System.out.println(sb3.hashCode());

    }
}
