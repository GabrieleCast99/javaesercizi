public class Professor extends CollegePerson implements TeachingPerson{
    public String teachingSubject;

    @Override
    public void teachToOtherPeople() {
        System.out.println("This Teacher "+this.name+" "+this.surname+" teaching");
    }
    public Professor (String name,String surname,int id,String subject){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.teachingSubject=subject;
    }
}
