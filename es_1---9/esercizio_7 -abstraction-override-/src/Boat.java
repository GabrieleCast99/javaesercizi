public class Boat extends iVehicle {
    double maxKnotsSpeed;
    int boatKilosWeight;


    @Override
    void doVehicleSound() {
        System.out.println("The sound of Vehicle is clunch" );
    }

    public Boat(double maxSpeed,int weight){
        this.maxKnotsSpeed=maxSpeed;
        this.boatKilosWeight=weight;
        this.type="boat";
        this.numberOfWheels=0;
    }

    void getBoatWeightAndSpeed(){
        System.out.println("The max speed of the boat is: "+maxKnotsSpeed+" - and the weight is: "+boatKilosWeight+" kg ");
    }
}
