public class Arrayy {
    public static void main(String[] args) {
        String[] cars = { "Lamborghini", "Bugatti", "Ferrari", "BMW" };
        int[] numbers = { 90, 80, 60, 85, 100 };

        System.out.println(cars[0]);
        System.out.println(numbers[3]);
        System.out.println(cars.length);

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
