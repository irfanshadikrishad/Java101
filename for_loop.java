public class for_loop {
    public static void main(String[] args) {
        String[] cars = { "Lamborghini", "Bugatti", "Ferrari" };

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("i " + i);
        //     for (int j = 0; j < 10; j++) {
        //         System.out.println("j " + j);
        //     }
        // }

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
