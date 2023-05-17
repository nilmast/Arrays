public class ForEach {
    public static void main(String[] args) {
        int[] nums = new int[10];
        var sum = 0;
        for (int i = 0; i < nums.length; i++){
            nums[i] = i;
        }
        for (int num : nums) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();
        System.out.println(sum);
    }
}
// TODO: 17.05.2023  