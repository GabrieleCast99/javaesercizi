import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Waiting user input for address: ");
        house.setAddress(scanner.nextLine());
        System.out.println("Waiting user input for number of floors");
        house.setFloorsNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Waiting user input for name of the resident");
        house.setResidentsNames(scanner.nextLine().split(","));
        scanner.close();
        String houseDetails = String.format("%s\n%s : %s\n%s : %d\n%s : %s", "House Details:", "Address", house.getAddress(), "Number of floors", house.getFloorsNumber(), "Residents' names", Arrays.toString(house.getResidentsNames()));
        System.out.println(houseDetails);
    }
}