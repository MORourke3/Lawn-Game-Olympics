/**
 * Created by mjo95_000 on 10/29/2014.
 */
public class Stickgame extends Event{

    private int frisbeeSize = 5;

    Stickgame(){
        eventNamed("Stickgame");
    }

    public String getExtraInfo() {
        return "Frisbee Size: " + this.frisbeeSize;
    }
}
