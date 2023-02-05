import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa= new ArrayList();
        List<Integer> projectMarksListJeremy= new ArrayList();

        individualMarksListLisa.add(5.4);
        individualMarksListLisa.add(8.3);

        projectMarksListJeremy.add(3);
        projectMarksListJeremy.add(6);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents= new ArrayList();
        listOfStudents.add(new Student("lisa","under",lisaAvg));
        listOfStudents.add(new Student("Jeremy","wood",jeremyAvg));
        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));
    }
}