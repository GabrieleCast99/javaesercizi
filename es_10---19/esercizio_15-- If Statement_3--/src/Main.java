import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int value = randomNumbers.nextInt(35);
        Student student1=new Student("gabri",24);
        System.out.println("I generated the random number "+value+" for student "+ student1.name+" age: "+student1.age);

        if (value== student1.age){
            System.out.println("the random value is equal age");
        } else if (value< student1.age) {
            System.out.println("the random value is less than age");
        }else if (value> student1.age){
            System.out.println("the random value is more than age");
        }
    }
}