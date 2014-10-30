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
                if (args.length > 0) {

                    // checks if the user input anything other than a valid command and prints a message if it is not a command
                    if (userInput.equalsIgnoreCase("h") == true || userInput.equalsIgnoreCase("help") == true) {   // allows the help menu to be access if the user types h or help, in any case, meaning H or h
                        callhelp();
                    } else {
                        if (userInput.equalsIgnoreCase("o") == true || userInput.equalsIgnoreCase("olympians") == true) { // allows the olympian list to be accessed, in addition to any case
                            callolympians();
                        } else {
                            if (userInput.equalsIgnoreCase("e") == true || userInput.equalsIgnoreCase("events") == true) {  // allows the event list to be accessed, in addition to any case
                                callevents();
                            } else {
                                if (userInput.equalsIgnoreCase("q") == true || userInput.equalsIgnoreCase("quit") == true) {  // allows the escape method to be utilized, in addition to any case
                                    end();
                                } else {
                                    if (userInput.equalsIgnoreCase("t") == true || userInput.equalsIgnoreCase("teams") == true) {  // allows the teams method to be utilized, in addition to any case
                                         callteams();
                                    } else {
                                        System.out.println("Invalid command, please try again.");
                                        System.out.println("If you are having issues please hit \"h\" to access the help screen");
                                    }
                                }
                            }
                        }
                    }
                }
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
            System.out.println(C[i].eventName()); // prints each element from the event class
            System.out.println(C[i].getExtraInfo()); // prints each element from the extra info class

        }

    }

    public static void callolympians(){  // method used to call the olympics

        System.out.println(" ");
        System.out.println("Olympians: ");

        // creates an instance and allows it to be put into a for loop
        OlympianManager X = new OlympianManager();
        Olympian B[] = X.getOlympians();

        for (int i = 0; i < B.length; i++) {   // prints each of the elements
            //System.out.println(B[i]);
            System.out.println("Name: " + B[i].getName() + ", Age: " + B[i].getAge() + ", Sex: " + B[i].getSex());  // prints each element from the olympian class

        }
    }

    public static void callteams(){ // method used to call the teams

        System.out.println(" ");
        System.out.println("Teams: ");

        // creates an instance and allows it to be put into a for loop
        TeamManager Z = new TeamManager();
        Team D[] = Z.getTeams();

        for (int i = 0; i < (D.length);i++){
            System.out.println(D[i].olympian1.getName() + ", " + D[i].olympian2.getName()); // prints each person in a team of 2 randomly

        }
    }

}




