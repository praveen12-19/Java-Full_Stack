import java.util.Arrays;
public class Binarysearch {
    public static void main(String[] args) {
        int a[]={2,4,1,8,5,3,7};
        Arrays.sort(a);
        boolean isFound = false;
        int k=3;
        int low=0,high=a.length-1;
        while (low<=high) {
            int mid=low+(high-low/2);
            if(a[mid]==k){
                isFound=true;

            }
            else if(a[mid]<k){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
            
        }
        if(isFound){
            System.out.println("Seaarch element is found    n");
        }

    }
}
