public class Main {


    public static void main(String[] args) {
        Programmer gabri = new Programmer();
        gabri.name = "gabri";
        gabri.age = 24;
        gabri.wearsGlasses = false;
        gabri.hasGlasses();
        System.out.println(gabri.wearsGlasses);
        gabri.printDetails();
        Programmer samuele = new Programmer();
        samuele.name = "samuele";
        samuele.age = 20;
        samuele.wearsGlasses = true;
        samuele.drinkCoffe();
        samuele.printDetails();
    }
}
