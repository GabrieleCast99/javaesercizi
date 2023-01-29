public class Main {
    public static void main(String[] args) {
        String s1 = "tup tuup tuuup tuuuup";
        String s2 = s1.replaceAll("\s*u\s*","x");
        System.out.println(s2);
    }
}