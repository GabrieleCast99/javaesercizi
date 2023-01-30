public class Main {
    public static void main(String[] args){
        Car fiat = new Car(2,4,15000);
        fiat.doVehicleSound();
        fiat.showVehicleDetails();
        Boat Yachts = new Boat(50,300000);
        Yachts.doVehicleSound();
        Yachts.showVehicleDetails();
        Yachts.getBoatWeightAndSpeed();
    }
}