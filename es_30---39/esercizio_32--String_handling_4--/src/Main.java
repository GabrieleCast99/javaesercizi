public class Main {
    public static void main(String[] args) {
        String s1= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String s2 = s1.replace("um","HUM");
        System.out.println(s2);
        String[] part = s2.split("aliquip");
        String sub1 = part[0];
        String sub2 = part[1];
        System.out.println(sub1.trim());
        System.out.println(sub2.trim());
        System.out.println("Sub 1 contains 'est' ? "+sub1.contains("est"));
        System.out.println("Sub 2 contains 'est' ? "+sub2.contains("est"));
    }
}