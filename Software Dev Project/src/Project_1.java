// Michael O'Rourke

import java.io.*;

public class Project_1 {

    public static void main(String[] args) {

        System.out.println("Lawn Game Olympics");

        // initializes input
        BufferedReader input;


        try { // implements the function to allow the user to input
            input = new BufferedReader(new InputStreamReader(System.in));
            String userInput;

            // keeps the program looping so user commands can be run in a single instance of the program rather than close and open every time
            while ((userInput = input.readLine()) != null)


                    // checks if the user input anything other than a valid command and prints a message if it is not a command
                    if (userInput.equalsIgnoreCase("h") || userInput.equalsIgnoreCase("help")) {   // allows the help menu to be access if the user types h or help, in any case, meaning H or h
                        callhelp();
                    } else {
                    if (userInput.equalsIgnoreCase("o") || userInput.equalsIgnoreCase("olympians")) { // allows the olympian list to be accessed, in addition to any case
                        callolympians(args[0]);
                    } else {
                    if (userInput.equalsIgnoreCase("e")  || userInput.equalsIgnoreCase("events")) {  // allows the event list to be accessed, in addition to any case
                        callevents();
                    } else {
                    if (userInput.equalsIgnoreCase("q")  || userInput.equalsIgnoreCase("quit")) {  // allows the escape method to be utilized, in addition to any case
                        end();
                    } else {
                    if (userInput.equalsIgnoreCase("t") || userInput.equalsIgnoreCase("teams")) {  // allows the teams method to be utilized, in addition to any case
                        callteams(args[0]);
                    } else {
                    if (userInput.equalsIgnoreCase("c") || userInput.equalsIgnoreCase("competitions")) { // allows the competition method to be utilized, in addition to any case
                        callcompetitions();
                    } else {
                    if (userInput.equalsIgnoreCase("sc")  || userInput.equalsIgnoreCase("startcompetition")) {  // allows the start competition method to be utilized, in addition to any case
                        startcompetition();
                    } else {
                    if (userInput.equalsIgnoreCase("ec") || userInput.equalsIgnoreCase("endcompetition")) {  // allows the end competition method to be utilized, in addition to any case
                        endcompetition();
                    } else {
                        System.out.println("Invalid command, please try again.");
                        System.out.println("If you are having issues please hit \"h\" to access the help screen");

                            }}}}}}}}

             }
            catch (IOException ioe){ // allows the function to be caught if it fails
                System.out.println("IOE catch");
        }
    }

    public static void callhelp() { // method used to call the help info to the console

        System.out.println(" ");
        System.out.println("The commands are not case sensitive");
        System.out.println("h, or help, for help console");
        System.out.println("e, or events, for events");
        System.out.println("o, or olympians, for olympians");
        System.out.println("t, or teams, for teams");
        System.out.println("q, or quit, to end the program");
        System.out.println("c, or competition, to list the competitions in progress");
        System.out.println("sc, or startcompetition, to start a competition");
        System.out.println("ec, or endcompetition, to end a competition in progress");

    }

    public static void end(){   // method to allow the program to end
        System.exit(0);

    }

    public static void callevents(){ // method used to call the events

        System.out.println(" ");
        System.out.println("Lawn Game Events: ");

        EventManager Y = new EventManager();
        Event C[] = Y.getEvent();

        for (int i = 0; i < C.length; i++){   // prints each of the elements
            System.out.println(C[i].getName()); // prints each element from the event class
            System.out.println(C[i].getExtraInfo()); // prints each element from the extra info class

        }

    }

    public static void callolympians(String args){  // method used to call the olympics

        System.out.println(" ");
        System.out.println("Olympians: ");

        // creates an instance and allows it to be put into a for loop
        OlympianManager X = new OlympianManager(args);
        Olympian B[] = X.getOlympians();

        for (int i = 0; i < B.length; i++) {   // prints each of the elements
            //System.out.println(B[i]);
            System.out.println("Name: " + B[i].getName() + ", Age: " + B[i].getAge() + ", Sex: " + B[i].getSex());  // prints each element from the olympian class

        }
    }

    public static void callteams(String args){ // method used to call the teams

        System.out.println(" ");
        System.out.println("Teams: ");

        // creates an instance and allows it to be put into a for loop
        TeamManager Z = new TeamManager(args);
        Team D[] = Z.getTeams();

        for (int i = 0; i < (D.length);i++){
            System.out.println(D[i].olympian1.getName() + ", " + D[i].olympian2.getName()); // prints each person in a team of 2

        }
    }

    public static void callcompetitions(){

        System.out.println(" ");
        System.out.println("Competitions in progress: ");

        CompetitionManager X = new CompetitionManager();

        // prints out the currently running competitions and which teams are playing
        for (int i = 0; i < X.getCompetitions().length; i++){

            ICompetition game = X.getCompetitions()[i];

            System.out.println( game.getteam1().olympian1.getName()
                                + " , "
                                + game.getteam1().olympian2.getName()
                                +" are playing: "
                                + game.getevent()
                                + ". Against "
                                + game.getteam2().olympian1.getName()
                                + " , "
                                + game.getteam2().olympian2.getName() );
        }

        }


    public static void startcompetition(){

        System.out.println(" ");
        System.out.println("start competition");

        CompetitionManager X = new CompetitionManager();
        BufferedReader input;

        // reads input of console and starts a competition and logs it
        // is not working
        try{
            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Which event is beginning?");
            System.out.println("Which two teams are participating?");
            input.readLine() = X.StartCompetition(Event, Team, Team);

        }catch (IOException ioe) {
            // allows the function to be caught if it fails
            System.out.println("IOE catch");
        }

    }

    public static void endcompetition(){

        System.out.println(" ");
        System.out.println("end competition");

        CompetitionManager X = new CompetitionManager();
        BufferedReader input;

        // reads input of console and ends a competition and logs it
        // is not working
        try{
            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Which event is ending?");
            System.out.println("Which team won?");
            input.readLine() = X.EndCompetition(Competition, Team);

        }catch (IOException ioe) {
            // allows the function to be caught if it fails
            System.out.println("IOE catch");
        }


    }


}




