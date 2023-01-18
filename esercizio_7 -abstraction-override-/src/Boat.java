public class Boat extends iVehicle {
    double maxKnotsSpeed;
    int boatKilosWeight;


    @Override
    void doVehicleSound() {
        System.out.println("The sound of Vehicle is clunch" );
    }

    void boatDetails(double maxSpeed,int weight){
        this.maxKnotsSpeed=maxSpeed;
        this.boatKilosWeight=weight;
    }

    void getBoatWeightAndSpeed(){
        System.out.println("The max speed of the boat is: "+maxKnotsSpeed+" - and the weight is: "+boatKilosWeight+" kg ");
    }
}
