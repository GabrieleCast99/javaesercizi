//esercizio svolto con giuseppe figuccia
public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Car car = new Car("FIAT 4X4", 102250);

        car.printCarDetails();
        System.out.println("----------------");
        car.getCarDetails();
    }
}