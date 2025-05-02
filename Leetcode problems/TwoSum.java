import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            // if(target>=nums[i]){
                for(int j=i+1; j<nums.length; j++){
                    // if(target>=nums[j]){
                        if(target == (nums[i] + nums[j])){
                            return new int[]{i,j};
                        }
                    // }
                }
            // }
        }
        return new int[]{}; 
    }
    public static void main(String[] args) {
        int[] arr = {-11,15,-2,11};
        int target = 0;
        System.out.print(Arrays.toString(twoSum(arr, target)));       
    }
}