import java.util.Collections;
import java.util.Random;

public class CustomNumber {
    int number;

    public CustomNumber(){
        Random rand= new Random();
        number= rand.nextInt(12)+1;
    }

    public void getMultiplicationTable(){
        for(int i=12;i>0;i=i-1){
            int x = number*i;
            System.out.println("the multiplication between "+ number + " and "+ i+" is "+x);

        }

    }
}
