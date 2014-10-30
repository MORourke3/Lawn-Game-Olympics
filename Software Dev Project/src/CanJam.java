/**
 * Created by mjo95_000 on 10/29/2014.
 */
public class CanJam extends Event{

    private int frisbeeSize = 5;

    CanJam(){
        eventNamed ("CanJam");
    }

    public String getExtraInfo() {
        return "Number of Bean Bags: " + this.frisbeeSize;
    }
}
