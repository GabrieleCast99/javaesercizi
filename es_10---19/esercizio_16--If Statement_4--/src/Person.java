public class Person {
    int age;
    public Person() {
        int min = 5;
        int max = 80;
        int range = max - min + 1 + min;
        int randomAge = (int) Math.floor(Math.random() * (double)range);
        this.age = randomAge;
    }

    public String getLifeStage() {
        String life="";
        if (age <= 12) {
            System.out.println(" Is a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println(" Is a Teen");
        } else if (age >= 20 && age <= 59) {
            System.out.println(" Is an Adult");
        }else if (age >60) {
            System.out.println(" Is an Senior Adult");
        }

        return life;
    }
}
