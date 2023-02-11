import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Random random= new Random();
        int number= random.nextInt(1,11);

        System.out.println("------------------");
        System.out.println(number);//this is the number to guess, i entered it to verify that the code worked
        System.out.println("------------------");


        Scanner input= new Scanner(System.in);
        System.out.println("Try to guess the number between 1 and 10: ");
        int output= input.nextInt();
            while (output!=number){
                System.out.println("Try again is wrong!");
                int output2= input.nextInt();
                output=output2;
                    if (output==number){
                        System.out.println("Congratulations is correct!");
                        break;
                    }

            }

    }
}