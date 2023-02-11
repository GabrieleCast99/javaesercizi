import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i= 1;
        while(i>0){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a command: " );
            String output= input.nextLine();
            System.out.println(output);
                if(output.equals("stop")){
                    i=0;

                }else{
                    System.out.println("repeat a input, if want terminate digit 'stop'");
                    i++;
            }
        }
    }
}