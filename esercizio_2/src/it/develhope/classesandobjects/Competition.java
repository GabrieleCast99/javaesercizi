package it.develhope.classesandobjects;

public class Competition {
    public static void main(String args[]) {

        Team teamA = new Team();
        teamA.teamName = "radio";
        teamA.p1.name = "gabri";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 1;
        teamA.p2.name = "samu";
        teamA.p2.programmingLanguage = "Java";
        teamA.p2.yearsOfExperience = 2;


        Team teamB = new Team();
        teamB.teamName = "tv";
        teamB.p1.name = "claudia";
        teamB.p1.programmingLanguage = "Python";
        teamB.p1.yearsOfExperience = 3;
        teamB.p2.name = "piero";
        teamB.p2.programmingLanguage = "Python";
        teamB.p2.yearsOfExperience = 4;
        CompetitionRules X = new CompetitionRules();
        CompetitionRules Prova = CompetitionRules.getInstance(X);
        Prova.printRules();
        System.out.println("-----------");

        teamA.printTeamDetails();
        teamB.printTeamDetails();

    }
}