public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cow cow = new Cow();
        Lion lion = new Lion();
        lion.animalName="giggi";
        cow.animalName="fred";
        animal.animalName="not found";
        animal.animalSound(" ");
        lion.animalSound("Lion");
        cow.animalSound("Cow");
    }
}