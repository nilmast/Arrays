import java.util.Arrays;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (i + 1) * (j + 1);

            }
        }
        System.out.println(Arrays.deepToString(nums));
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
// TODO: 17.05.2023  
