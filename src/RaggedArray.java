public class RaggedArray {
    public static void main(String[] args) {
        int[][] trips = new int[7][];
        for (int i = 0; i < trips.length - 2; i++) {
            trips[i] = new int[10];

        }
        for (int i = 5; i < trips.length; i++) {
            trips[i] = new int[2];
        }
        for (int i = 0; i < trips.length - 2; i++) {
            for (int j = 0; j < trips[i].length; j++) {
                trips[i][j] = i + j + 10;
            }

        }
        for (int i = 5; i < trips.length; i++) {
            for (int j = 0; j < trips[i].length; j++) {
                trips[i][j] = i + j + 10;
            }

        }
        System.out.print("Количество пассажиров в будние и выходные: ");
        for (int[] i : trips) {
            System.out.println();
            System.out.println();
            for (int j : i) {
                System.out.print(j + "  ");
            }

        }
    }

}
