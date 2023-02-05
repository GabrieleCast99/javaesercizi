import java.util.ArrayList;
import java.util.List;

public class Student {

    String studentName;
    String studentSurname;
    double marksAverage;

    public Student(String name,String surname,double average){
        this.studentName=name;
        this.studentSurname=surname;
        this.marksAverage=average;
    }

    public static double getAverageMark(List<? extends Number> listOfMarks){
    double marks= ((Number)listOfMarks.get(0)).doubleValue() + ((Number)listOfMarks.get(1)).doubleValue();
        double average = marks / 2.0;
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }




}
