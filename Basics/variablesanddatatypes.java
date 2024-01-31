package Basics;

// Primitive data types - 
// includes byte, short, int, long, float, double, boolean and char

public class variablesanddatatypes {
    public static void main(String[] args) {
        String name = "Zeitu";
        int age = 22;
        double popularity = 85.9;
        float float1 = 59.5f;
        char letter = 'Z';
        boolean isUpdated = true;
        byte byte_max = Byte.MAX_VALUE;
        byte byte_min = Byte.MIN_VALUE;
        long long_max = Long.MAX_VALUE;
        long long_min = Long.MIN_VALUE;
        short short_max = Short.MAX_VALUE;
        short short_min = Short.MIN_VALUE;

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        long test = 2147483648L;

        System.out.println("Hello, " + name + " " + age + " " + popularity);
        System.out.println(float1);
        System.out.println(letter + " " + isUpdated);
        System.out.println(min + " " + max);
        System.out.println(byte_min + " " + byte_max);
        System.out.println(long_min + " " + long_max);
        System.out.println(test);
        System.out.println(short_min + " " + short_max);
    }
}
