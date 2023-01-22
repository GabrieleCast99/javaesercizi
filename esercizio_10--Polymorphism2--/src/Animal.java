public class Animal {
    String animalName;

    public void Animal(String animalName){this.animalName=animalName;}

    public void animalSound(){
        System.out.println(this .animalName + " makes this sound: ");
    }

    public void animalSound(String animalName){
        String result = this.animalName + " makes this sound: ";
                switch(animalName){
                    case "Lion":
                        result=result+" roar ";
                        break;
                    case "Cow":
                        result=result+ " muuu ";
                        break;
                    default:
                        result=result+ "not accept";
                        break;
                }
                System.out.println(result);
    }
}
