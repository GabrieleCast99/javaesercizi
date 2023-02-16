public class Car {
    private String modelName;
    private int mileage;

    public Car(String modelName,int mileage){
        this.modelName=modelName;
        this.mileage=mileage;
    }

    @Deprecated
    public void printCarDetails() {
        System.out.println("Car model: " + modelName + ", Mileage: " + mileage);
    }

    @Deprecated
    public void getCarDetails() {
        System.out.println("Car model: " + modelName);
        System.out.println("Mileage: " + mileage);
    }
}

