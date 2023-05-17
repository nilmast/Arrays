public class MinMax {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int min, max;
        for (int i = 0; i < nums.length; i++) nums[i] = (int) (Math.random() * 100);
        for (int num : nums){
            System.out.print(num + " ");

        }
        min = max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min) {min = nums[i];}
            if (nums[i] > max) {max = nums[i];}


        }
        System.out.printf("\nMin и max: %d и %d", min, max);
    }
}
