package es4;

public class Student {
    public String name;
    public int grade;
    public Student(String studentName) {
        System.out.println("You have created a new Object Student" );
        System.out.println("----");
        this.name=studentName;
        System.out.println("----");
    }
    public void getStudentDetails(){
        System.out.println(" Name "+name+" ,grade  "+grade);
    }
}
