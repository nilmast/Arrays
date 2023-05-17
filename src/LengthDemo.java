public class LengthDemo {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] nums = {1, 2, 3};
        int[][] table = new int[3][];
        table[0] = new int[3];
        table[1] = new int[2];
        table[2] = new int[4];
        for (int i = 0; i < table.length; i++) {
            System.out.println();
                for (int j = 0; j < table[i].length; j++) {
                    table[i][j] = (i * 4) + j + 1 - i;
                    System.out.print(table[i][j] + " ");
                }
        }
        System.out.println();
        System.out.println("Размер list: " + list.length);
        System.out.println("Размер nums: " + nums.length);
        System.out.println("Размер table: " + table.length);
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            System.out.printf("Размер table[%d]: %d", i, table[i].length);
        }
        System.out.println();
        for (int i = 0; i < list.length; i++){
            list[i] = i;
            System.out.print(list[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < list.length; i++){
            list[i] = i * i;
            System.out.print(list[i] + " ");

        }
// TODO: 17.05.2023  
    }
}

