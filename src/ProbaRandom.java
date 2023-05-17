public class ProbaRandom {
    public static void main(String[] args) {
        //[20; 40]  (40 - 20) + 20
        int rand = (int) (Math.random() * 20 + 20);

        System.out.println(rand);
        //[- 20; 40]  (40 + 20) - 20
        rand = (int) (Math.random() * 60 - 20);

        System.out.println(rand);
        //[3; 9]  (9 - 3) + 3
        rand = (int) (Math.random() * 6 + 3);

        System.out.println(rand);
        //[-2; 40]  (40 + 2) - 2
        rand = (int) (Math.random() * 42 - 2);

        System.out.println(rand);


    }
}
