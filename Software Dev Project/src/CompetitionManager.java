import java.util.ArrayList;


public class CompetitionManager {

    public static Competition next;
    public static Competition prev;
    private static Competition tail;
    private static Competition head;
    private static Competition currItem = null;

    //sets up an array to be used for the list of competitions
    public static ICompetition[] getCompetitions(){

        ArrayList array = new ArrayList();
        for (Competition currItem = head; currItem != null; currItem = currItem.next){

            array.add(currItem);

        }

        return (ICompetition[]) array.toArray();

    }

    //function to start a competition
    public static void StartCompetition(Event event, Team team1, Team team2){

        Competition NewCompetition = new Competition(event, team1, team2);

        if(tail == null){

            head = NewCompetition;
            tail = NewCompetition;

        } else {

            NewCompetition.prev = tail;
            tail.next = NewCompetition;
            tail = NewCompetition;

        }

    }

    //function to end a competition
    public static void EndCompetition(Competition competition, Team winningTeam){

        Competition currItem = competition;
        Competition nextItem = currItem.next;
        Competition prevItem = currItem.prev;
        nextItem.prev = prevItem;
        prevItem.next = nextItem;

    }




}
