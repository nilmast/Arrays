import java.util.Arrays;

public class NoChange {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        // Не меняет содержимое
        for (int num : nums) {
            num = num * 10;

        }
        System.out.println(Arrays.toString(nums));
    }
}
