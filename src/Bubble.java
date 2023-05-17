public class Bubble {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int) (Math.random() * 100);

        int temp;
        System.out.print("Исходный массив: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print("\nСортированный массив: ");
        for (int num : nums)
            System.out.print(num + " ");

    }
}
