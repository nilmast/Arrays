public class АСору {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int[] nums2 = new int[20];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i;

        }
        if (nums2.length >= nums1.length){
            for (int i = 0; i < nums1.length; i++) {
                nums2[i] = nums1[i];

            }
        }
        for (int i : nums2) {
            System.out.print(i + " ");

        }
    }
}
// TODO: 17.05.2023
