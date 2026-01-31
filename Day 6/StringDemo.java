
public class StringDemo {
    public static void main(String[] args) {
        String str =new String("Pravii");
        System.out.println(str);
        
        // length
        System.out.println(str.length());

        //isBlank
        // it return true if it has whitesspaces and also have the length as zero,otherwise false
        String s1= " ";
        System.out.println(s1.isBlank());

        //isEmpty
        // it return true when the length is zero ,oitherwise false
        String s2 ="";
        System.out.println(s2.isEmpty());

        //equals
        String s3="Abc";
        String s4="abc";
        System.out.println(s3.equals(s4));

        //equalsIgnoreCase
        String s13="Abc";
        String s14="abc";
        System.out.println(s3.equals(s4));

        //compareTo
        //it returns zero when all the characters are same,else returns negative if ss1<ss2,ekse return positive ss1>ss2
        String ss1="Pravi";
        String ss2="Pravi";
        System.out.println(ss1.compareTo(ss2));

        //compareToIgnoreCase
        String a="Pravi";
        String b="pravi";
        System.out.println(a.compareTo(b));

        //startswith
        String ab="Hello world";
        System.out.println(ab.startsWith("Hello"));

        //startswith
        String abc="Madurai";
        System.out.println(abc.startsWith("a",1));

        //endswith
        String p="Praveen";
        System.out.println(p.endsWith("n"));

        //Contentequals
        String p1 ="Hello";
        System.out.println(p1.contentEquals("hello"));

        //contains
        String pr="My Native is Madurai";
        System.out.println(pr.contains("is"));
    }
}
