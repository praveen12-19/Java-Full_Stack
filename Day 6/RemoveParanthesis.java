public class RemoveParanthesis {
    public static void main(String[] args) {
        String s= "(()()()(()))";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                count--;
            }
            if(count!=0){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                count++;
            }
        }
        //return sb.toString();
        System.out.println(sb.toString());
    }
}
