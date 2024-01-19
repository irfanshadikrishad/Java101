public class strings {
    public static void main(String[] args) {
        String txt = "War is Peace, Freedom is Slavery, Ignorence is Strength";
        System.out.println(txt);
        System.out.println("length " + txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.indexOf("Peace"));
        System.out.println(txt.concat(" " + String.valueOf(txt.length())));
    }
}
