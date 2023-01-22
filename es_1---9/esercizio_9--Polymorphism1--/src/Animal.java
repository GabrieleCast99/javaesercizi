public class Animal {
    private String animalName;

    public Animal(String animalName) {this.animalName=animalName;}

    public void animalSound(){System.out.println(this.animalName+ "   the sound is roar  ");}

    public void animalSound(String intensity){
        String result = this.animalName + "  the sound is: ";
        switch (intensity){
            case "high":
                result=result+" roooooar";
                break;
            case "low":
                result=result+" roar";
                break;
            default:
                result=result+" not accepted";

        }
        System.out.println(result);
    }
}
