public class Main {
    public static void main(String[] args) {
        SmartphonePrice producerprice1 = new SmartphonePrice("producer",150.00 );
        SmartphonePrice producerprice2 = new SmartphonePrice("producer2",130.00);
        SmartphonePrice retailprice1 = new SmartphonePrice("retail1",200.00);
        SmartphonePrice retailprice2 = new SmartphonePrice("retail2",250.00);
        Smartphone apple = new Smartphone("apple","XS",100,producerprice1,retailprice1);
        Smartphone samsung= new Smartphone("samsung","A10",95,producerprice2,retailprice2);
        System.out.println("The first smartphone is: "+ apple);
        System.out.println(apple.hashCode());
        System.out.println("--------------");
        System.out.println("The second smartphone is: "+ samsung);
        System.out.println(samsung.hashCode());
        System.out.println("--------------");
        boolean out = apple.equals(samsung);
        System.out.println("Is the first smartphone the same as the second? "+ out);
        System.out.println("--------------");

        try {

            Smartphone clonedsamsung = samsung.clone();
            System.out.println("The cloned smartphone is: "+clonedsamsung);
            System.out.println(clonedsamsung.hashCode());
            System.out.println("--------------");
            boolean out2= samsung.equals(clonedsamsung);
            System.out.println("Is the second smartphone the same as the clone? "+ out2);




        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Something went wrong ");

        }




    }
}