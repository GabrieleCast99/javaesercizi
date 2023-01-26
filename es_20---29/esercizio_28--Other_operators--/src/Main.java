public class Main {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a + 1;

        System.out.println("  b is an odd number and the result of (b multiplied for b + 1) is a multiple of 3?  " + (b % 2 != 0 && b * (b + 1) % 3 == 0));
    }
}