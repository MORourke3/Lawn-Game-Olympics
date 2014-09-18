import java.util.Scanner; // initializes the scanner for user input
public class Project_1 {
    public static void main(String[] args) {
        System.out.println("Lawn Game Olympics");

        while(true) {     // an infinite loop to allow the user to repeat commands for help, events, or olympians at will
            Scanner inputReader = new Scanner(System.in);  // creates the scanner allowing the imported scanner command to be utilized
            String input = inputReader.nextLine();
            // checks if the user input anything other than a valid command and prints a message if it is not a command
            if (input.equalsIgnoreCase("h") != true && input.equalsIgnoreCase("help") != true && input.equalsIgnoreCase("o") != true && input.equalsIgnoreCase("olympians") != true && input.equalsIgnoreCase("e") != true && input.equalsIgnoreCase("events") != true) {
                System.out.println("Invalid command, please try again.");
                System.out.println("If you are having issues please hit \"h\" to access the help screen" );
            }
            if (input.equalsIgnoreCase("h") == true || input.equalsIgnoreCase("help") == true) {   // allows the help menu to be access if the user types h or help, in any case, meaning H or h
                callhelp();
            }

            if (input.equalsIgnoreCase("o") == true || input.equalsIgnoreCase("olympians") == true) { // allows the olympian list to be accessed, in addition to any case
                callolympians();
            }

            if (input.equalsIgnoreCase("e") == true || input.equalsIgnoreCase("events") == true){  // allows the event list to be accessed, in addition to any case
                callevents();

            }
        }
    }


    public static void callhelp() { // method used to call the help info to the console
        System.out.println("Lawn Game Olympics");
        System.out.println(" ");
        System.out.println("The commands are not case sensitive");
        System.out.println("h, or help, for help console");
        System.out.println("e, or events, for events");
        System.out.println("o, or olympians, for olympians");


    }

    public static void callevents(){ // method used to call the events array
        // Initializes the array for the events and 6 are listed
        String[] Events = {
                "Washoos",
                "CanJam",
                "Horseshoes",
                "Cornhole",
                "Ladderball",
                "Stickgame",
        };

        System.out.println("Lawn Game Olympics");
        System.out.println(" ");
        System.out.println("Lawn Game Events: ");

        for (int i = 0; i <= Events.length - 1; i++){   // prints each of the elements in the array
            System.out.println(Events[i]);
        }
    }

    public static void callolympians(){  // method used to call the olympics array

        // Initializes the array for the olympians and 16 are listed
        // with their ages and sexes in the second portion of the array
        String[][] Olympians = {
                {"Steve","Age: 22, Sex: Male"},
                {"Sam","Age: 25, Sex: Male"},
                {"Jeb","Age: 40, Sex: Male"},
                {"John","Age: 20, Sex: Male"},
                {"Geoff","Age: 32, Sex: Male"},
                {"Kevin","Age: 18, Sex: Male"},
                {"Chris","Age: 14, Sex: Male"},
                {"Tyler","Age: 16, Sex: Male"},
                {"Omar","Age: 54, Sex: Male"},
                {"Samantha","Age: 24, Sex: Female"},
                {"Arlene","Age: 19, Sex: Female"},
                {"Shannon","Age: 13, Sex: Female"},
                {"Miranda","Age: 45, Sex: Female"},
                {"Cathrine","Age: 25, Sex: Female"},
                {"Laura","Age: 29, Sex: Female"},
                {"Jillian","Age: 30, Sex: Female"},
        };


        System.out.println("Lawn Game Olympics");
        System.out.println(" ");
        System.out.println("Olympians: ");

        for (int i = 0; i <= Olympians.length - 1; i++) {      // finds each of the elements in the array for the first element, names
            for (int x = 0; x <= Olympians[0].length - 1; x++) {   // finds each of the elements in the array for the second element, ages and sexes
                System.out.println(Olympians[i][x]);            // prints both the names, ages, and sexes for both elements in the array
            }
        }
    }
}








