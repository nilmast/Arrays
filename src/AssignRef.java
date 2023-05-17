public class AssignRef {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for (int i = 0; i < nums1.length; i++) nums1[i] = i;
        for (int i = 0; i < nums2.length; i++) nums2[i] = -i;
        System.out.print("Массив 1: ");
        for (int num : nums1) System.out.print(num + "  ");
        System.out.print("\nМассив 2: ");
        for (int num : nums2) System.out.print(num + " ");

        nums2 = nums1;

        System.out.print("\n\nМассив 2 после присвоения: ");
        for (int num : nums2) System.out.print(num + "  ");

        for (int i = 3; i < nums2.length; i ++) nums2[i] = i * 22;

        System.out.print("\nМассив 1 после изменений через переменную 2: ");
        for (int num : nums1) System.out.print(num + "  ");
    }
}
