public abstract class iVehicle {
    public String type;
    public int numberOfWheels;

    void showVehicleDetails(){
        System.out.println("Type of vehicle: "+type+" and number of wheels: "+numberOfWheels);
    }
    abstract void doVehicleSound();
}
