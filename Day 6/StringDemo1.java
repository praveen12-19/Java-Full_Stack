
public class StringDemo1 {
    public static void main(String[] args) {
        
        //indexOf()
        String s ="I like Biriyani";
        System.out.println(s.indexOf("y"));

        //indexOf(with index)
        System.out.println(s.indexOf("a", 4));

        //lastIndex()
        System.out.println(s.lastIndexOf("i"));

        //substring(start index,end index-1)
        String str="My laptop";
        System.out.println(str.substring(0, 6));

        //charAt
        String st="My world";
        System.out.println(st.charAt(7));

        //subsequence()
        String str1="My coding world";
        System.out.println(str1.subSequence(0, 4));
    }
    
}
