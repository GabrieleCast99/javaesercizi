package es4;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Gabriele");
        Student student2 = new Student("Samu");
        Teacher teacher1 = new Teacher();
        teacher1.teacherName="Anna";
        Teacher.assignGrade(student1,2);
        Teacher.assignGrade(student2,3);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}