public class Main {

    public static void main(String[] args) {

        int a =1;
        int b=3;
        int  c=a*b;
        int d=c;

        if((d / c + 2) >= b || !(c + b - c / a == 3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int x=5;
        int y=6;
        boolean t= false;
        boolean f= true;


        if((x * x - y * y / 2 != 12) || !t && f) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}