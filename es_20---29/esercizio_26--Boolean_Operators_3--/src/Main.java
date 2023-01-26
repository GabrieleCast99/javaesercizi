public class Main {
    public static void main(String[] args) {
        if(!(!(!(false ^ false) || (true && true)))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int x=3;
        int y=2;


        if(!((x * y) <= 6) && (x - y != 1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}