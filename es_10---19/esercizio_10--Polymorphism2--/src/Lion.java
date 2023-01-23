public class Lion extends Animal{
    public Lion(String animalName) {super(animalName);}

    @Override
    public void animalSound() {
        System.out.println(this.animalName +" The sound is Roar ");
    }
}
