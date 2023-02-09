import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> divisorsOf52= new ArrayList<Integer>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);

        List<Integer> randomNumbers=new ArrayList<Integer>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);


        randomNumbers.addAll(4,divisorsOf52);
        System.out.println(randomNumbers);
        System.out.println("----------");


        randomNumbers.remove(2);
        System.out.println(randomNumbers);
        randomNumbers.remove(3);
        System.out.println(randomNumbers);
        System.out.println(randomNumbers.size());
        System.out.println("----------");

        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println(randomNumbers);
    }
}