public class TwoSum_1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] index = new int[2];
        for (int i = 0 ; i < nums.length ; i++ ){
            for (int j = 0 ; j < nums.length ; j++){
                if (i != j ) {
                    sum = nums[i] + nums[j];
                    if (target - sum == 0) {
                        index[0] = i;
                        index[1] = j;
                    }
                }
            }
        }
        return index;
    }
}
