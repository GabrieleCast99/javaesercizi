public class Main {

    public static void main(String[] args){
    Student Student= new Student("Gabri","casti",24075,24);
    Professor professor= new Professor("Claudia","garz",94675,"math");
    Assistant assistant= new Assistant("matteo","cast",98090,false);
    Student.goToCollege();
    professor.goToCollege();
    assistant.goToCollege();
    Student.studyAtHome();
    professor.teachToOtherPeople();
    assistant.teachToOtherPeople();
    }
}