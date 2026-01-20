public class Minimum_Finding{
    public static void main(String[] args) {
        int a[]={90,23,25,82,64};
        int min=a[0];
        //iterate
        for(int  i=1;i<a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);

    }
}
