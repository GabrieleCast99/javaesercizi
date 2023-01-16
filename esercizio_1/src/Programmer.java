public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;

    public Programmer() {
    }

    void drinkCoffe() {
        System.out.println("Espresso is the secret!");
    }

    void printDetails() {
        System.out.println(this.name + " is a " + this.age + " programmer ");
    }

    void hasGlasses() {
        System.out.println(" Is " + this.name + " wearing glasses? ");
    }

    public void main(String[] args) {
        this.hasGlasses();
        this.drinkCoffe();
        this.printDetails();
    }

    public String print() {
        return this.name + "-" + this.age + "-" + this.wearsGlasses;
    }
}
