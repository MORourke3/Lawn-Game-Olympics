
public abstract class Event {

    // creates the variables to be used by the events
    String name;
    int playTo;
    boolean isPlayToExact;
    int playDistance;

    // Initializes the array for the events and 6 are listed
    static String[] array = {
            "Washoos",
            "CanJam",
            "Horseshoes",
            "Cornhole",
            "Ladderball",
            "Stickgame",
    };
    // creates a new instance of event manager "A" calling upon the string "array" to fill it
    static EventManager A = new EventManager(array);


    // each event is created as a subclass to be used by event

    public class CanJamEvent {int FrisbeeSize;} {
    }

    public class CornHoleEvent {int NumBeanBags;}{
    }

    public class HorseShoesEvent {int NumHorseShoes;}{
    }

    public class LadderBallEvent {int NumRungs;}{
    }

    public class StickGameEvent {int FrisbeeSize;}{
    }

    public class WashoosEvent {boolean HasAutoWinStick; int NumWashoos;}{
    }

}

