package it.develhope.classesandobjects;

// singleton class
public class CompetitionRules  {
    private String competitionRule1 = "Do not copy and paste from StackOverflow!";

    private String competitionRule2 ="Learn every day!";

    private String competitionRule3 =  "Be the best team!";

    void printRules(){System.out.println( competitionRule1+ " " + competitionRule2+ " " + competitionRule3 );}

    public CompetitionRules(){}
    public static CompetitionRules getInstance(CompetitionRules instance) {
        if (instance == null) {
            instance = new CompetitionRules();
        }
        return instance;
    }
}
