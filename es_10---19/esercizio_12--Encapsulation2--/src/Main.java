import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Waiting user input for name: ");
        person1.setName(scanner.nextLine());
        System.out.println("Waiting user input for surname: ");
        person1.setSurname(scanner.nextLine());
        System.out.println("Waiting user input for height: ");
        person1.setHeight(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Waiting user input for age: ");
        person1.setAge(scanner.nextInt());
        scanner.close();
        String person1Details = String.format("%s\n%s : %s\n%s : %s\n%s : %.2f\n%s : %d"," Person details : "," The name is: ",person1.getName()," The surname is: ",person1.getSurname()," The height is: ", person1.getHeight()," The age is: ",person1.getAge()) ;
        System.out.println(person1Details);
    }
}