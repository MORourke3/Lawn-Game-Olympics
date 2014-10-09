public class Project_1 {

    public static void main(String[] args) {
        System.out.println("Lawn Game Olympics");

        if (args.length>0){
            String input = args[0];
            // checks if the user input anything other than a valid command and prints a message if it is not a command
            if (input.equalsIgnoreCase("h") == true || input.equalsIgnoreCase("help") == true) {   // allows the help menu to be access if the user types h or help, in any case, meaning H or h
                callhelp();
            }else {
                if (input.equalsIgnoreCase("o") == true || input.equalsIgnoreCase("olympians") == true) { // allows the olympian list to be accessed, in addition to any case
                    callolympians();
                } else {
                    if (input.equalsIgnoreCase("e") == true || input.equalsIgnoreCase("events") == true){  // allows the event list to be accessed, in addition to any case
                        callevents();
                    } else{
                        if (input.equalsIgnoreCase("esc") == true || input.equalsIgnoreCase("escape") == true) {  // allows the escape method to be utilized, in addition to any case
                            end();
                        } else {
                            System.out.println("Invalid command, please try again.");
                            System.out.println("If you are having issues please hit \"h\" to access the help screen");
                        }
                    }
                }
            }
        }else{
            System.out.println("Invalid command, please try again.");
            System.out.println("If you are having issues please hit \"h\" to access the help screen");
        }
    }

    public static void callhelp() { // method used to call the help info to the console

        System.out.println(" ");
        System.out.println("The commands are not case sensitive");
        System.out.println("h, or help, for help console");
        System.out.println("e, or events, for events");
        System.out.println("o, or olympians, for olympians");
        System.out.println("esc, or escape, to end the program");

    }

    public static void end(){   // method to allow the program to end, useful for scanner input rather than edit configurations
        System.exit(0);
    }

    public static void callevents(){ // method used to call the events array

        System.out.println(" ");
        System.out.println("Lawn Game Events: ");

        for (int i = 0; i < Event.A.name.length; i++){   // prints each of the elements in the array
            System.out.println(Event.A.name[i]); // prints each element from the event class
        }

    }

    public static void callolympians(){  // method used to call the olympics array

        System.out.println(" ");
        System.out.println("Olympians: ");

        for (int i = 0; i < Olympian.B.name.length; i++){   // prints each of the elements in the array
            System.out.println("Name: " + Olympian.B.name[i] + ", Age: " + Olympian.B.age[i] + ", Sex: " + Olympian.B.sex[i]);  // prints each element from the olympian class
        }

    }
}




