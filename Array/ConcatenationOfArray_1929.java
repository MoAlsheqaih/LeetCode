public class ConcatenationOfArray_1929 {
    public static void main(String[] args) {
        int[] array = new int[0];
        array = getConcatenation(array);
        for (Integer e : array ){
            System.out.println(e);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length * 2];
        for (int i = 0 ; i < nums.length ; i++){
            array[i] = nums[i];
            array[i+nums.length] = nums[i];
        }
        return array;
    }
}
