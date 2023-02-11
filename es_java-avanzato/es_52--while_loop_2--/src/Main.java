import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        int i =1;
        while(i>0){
            i++;
            try {  sleep(1000);  } catch (InterruptedException e) { }
            System.out.println("I am in loop");
        }
    }
}