import java.util.Random;
public class Student {
    String name;
    int age;

    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;



    }

    public void guessingAge() {
        Random randomNumbers = new Random();
        int value = randomNumbers.nextInt(35);

        System.out.println("I generated the random number " + value + " for student " + this.name + " age: " + this.age);

        if (value == this.age) {
            System.out.println("the random value is equal age");
        } else if (value < this.age) {
            System.out.println("the random value is less than age");
        } else if (value > this.age) {
            System.out.println("the random value is more than age");
        }
    }
}
