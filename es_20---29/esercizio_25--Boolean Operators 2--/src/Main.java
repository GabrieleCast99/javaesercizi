public class Main {
    public static void main(String[] args) {
        if((55 != 55) && (false ^ true)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        boolean b= false;
        boolean a= true;
        int c=2;
        char d='2';

        if((!a || !b) || c == d) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }



        if(false && true || false && !false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if((false && true) || (false || true)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}