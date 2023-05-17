public class Array3D {
    public static void main(String[] args) {
        int [][][] arr = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}};
        for (int [][] i : arr) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
