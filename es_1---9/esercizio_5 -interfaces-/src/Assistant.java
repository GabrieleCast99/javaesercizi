public class Assistant extends CollegePerson implements LearningPerson,TeachingPerson{
    public boolean isGoingToBeAPhD;
    @Override
    public void studyAtHome() {
        System.out.println("This Assistant "+this.name+" "+this.surname+" study at home");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("This Assistant "+this.name+" "+this.surname+" teaching");
    }

    public Assistant(String name,String surname,int id, boolean willBeAPhD){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.isGoingToBeAPhD=willBeAPhD;

    }


}
