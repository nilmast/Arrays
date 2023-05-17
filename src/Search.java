import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] nums = new int[8];
        int val = 5;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()  * 8);

        }
        System.out.print(Arrays.toString(nums));
        System.out.println();

        for (int num : nums) {
            if (num == val) {
                found = true; break; //flag
            }
        }
        System.out.println();
        if(found) System.out.println("That`s OK");
        else System.out.println("Let`s try again");



    }
}
// TODO: 17.05.2023