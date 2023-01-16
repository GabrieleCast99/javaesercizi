package es4;

public class Teacher {
    public String teacherName;

    public Teacher() {
        System.out.println("You have created a new Object Teacher");
        System.out.println("----");
    }
    public static void assignGrade(Student alum,int finalGrade){alum.grade=finalGrade;}

}
