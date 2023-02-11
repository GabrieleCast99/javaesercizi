public class Main {
    public static void main(String[] args) {
        int x=0 , y=1 ,z;
        int n=10;
        while(n>0){
            if(n ==10) {
                System.out.println(x);
                n--;
            }else if (n==9) {
                System.out.println(y);
                n--;
            }else{
            z=x+y;
            x=y;
            y=z;
            n--;
            System.out.println(z);
            }
        }
    }
}