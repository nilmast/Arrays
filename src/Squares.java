public class Squares {
    public static void main(String[] args) {
        int[][] sqrs = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}};
        System.out.print("Как бы массив: ");
        for (int[] i : sqrs) {
            System.out.println();
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
    }
}
