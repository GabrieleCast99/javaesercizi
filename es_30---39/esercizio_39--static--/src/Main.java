public class Main {
    public static void main(String[] args) {
        Employee employee1= new Employee("gabri","casti","via leonardo da vinci 12");
        Employee employee2= new Employee("samu","casti","via roma 31");
        Badge badge1=new Badge(employee1);
        Badge badge2=new Badge(employee2);
        badge1.showBadgeDetails();
        System.out.println("---------");
        badge2.showBadgeDetails();
        System.out.println("---------");

    }
}