import java.util.Arrays;

public class TargetTwoSum {
    public static void main(String[] args) {
        int []a={2,7,11,13,15,3};
        int k=10;
        TargetTwoSum t = new TargetTwoSum();
        int res [] = t.TargetTwoSum(a, k);
        System.out.println(Arrays.toString(res));
    }
    public int [] TargetTwoSum(int []a,int target){
        int sum =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }

}
