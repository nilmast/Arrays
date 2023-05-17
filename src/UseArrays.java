import java.util.Arrays;

public class UseArrays {
    public static void main(String[] args) {
        //Одномерные массивы
        float[] numbers = new float[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (float) (Math.random()* 100);
        }
        System.out.print("[");
        for (float number : numbers) {
            System.out.print(number + ", ");

        }
        System.out.print("]");
        System.out.println();
        float[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println();
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        numbersCopy = Arrays.copyOfRange(numbers, 2, 9);
        System.out.println(Arrays.toString(numbersCopy));
        numbersCopy = Arrays.copyOfRange(numbers, 2, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println();

        // Двумерные массивы
        int [][] numbers2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] numbers2dCopy = Arrays.copyOf(numbers2d, numbers2d.length);
        //Проверка равенства массивов
        System.out.println(Arrays.deepEquals(numbers2d, numbers2dCopy));
        System.out.println(Arrays.deepToString(numbers2dCopy));

    }
}
// TODO: 17.05.2023