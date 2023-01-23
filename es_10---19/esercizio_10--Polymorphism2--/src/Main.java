public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Piero");
        Cow cow = new Cow("fred");
        Lion lion = new Lion("giggi");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}