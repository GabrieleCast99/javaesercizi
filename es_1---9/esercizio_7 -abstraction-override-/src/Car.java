public class Car extends iVehicle{

    public int numberOfDoors;
    public double carPrice;

    @Override
    void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Number Of Doors: "+numberOfDoors);
    }




    @Override
    void doVehicleSound() {
        System.out.println("The sound of Vehicle is Brum Brum");
    }

    public Car(int wheels,int doors,double price){
        this.numberOfWheels=wheels;
        this.numberOfDoors=doors;
        this.carPrice=price;
        this.type="car";

    }
}
