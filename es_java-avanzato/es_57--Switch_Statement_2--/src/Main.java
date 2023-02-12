import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        Scanner input= new Scanner(System.in);
        System.out.println("insert a string:\n"+"if the entered value is:\n" +
                "size - print the size of the list\n" +
                "clear - remove all the elements from the list\n" +
                "print - print the list ");


        int i=1;

        while (i<2){

            String output= input.nextLine();
            switch (output){
                case "size":
                    System.out.println(list.size());
                    break;

                case "clear":
                    list.clear();
                    System.out.println("the list has been cleaned");
                    break;

                case "print":
                    System.out.println("This is the list: "+list);
                    break;

                default:
                    list.add(output);
                    System.out.println("The string was added to the list");
                    break;
            }



        }


    }
}