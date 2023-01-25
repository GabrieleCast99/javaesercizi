public class Main {
    public static void main(String[] args) {
        if(2 <= 2 && !true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(!false && 3 > 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        boolean t= false;
        boolean f= true;

        if(!(!t || f)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(6 > 6 ^ !(true && true)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}