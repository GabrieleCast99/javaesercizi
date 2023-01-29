public class Main {
    public static void main(String[] args) {
        String s1 = "are you able to climb, are you able to swim or are you able to fly?";
        String s2 = s1.replaceAll("\sare","_XYZ");
        System.out.println(s2);
    }
}