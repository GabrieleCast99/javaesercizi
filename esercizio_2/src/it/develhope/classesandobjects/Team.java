package it.develhope.classesandobjects;

public class Team {
    public String teamName;
    Programmer p1 = new Programmer();


    Programmer p2 = new Programmer();

    public void printTeamDetails() {
        System.out.println(teamName + " Team name ");
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
        System.out.println("-----------");



    }
}
