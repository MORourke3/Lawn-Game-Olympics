/**
 * Created by mjo95_000 on 10/29/2014.
 */
public class Washoos extends Event{

    private boolean hasAutoWinStick = true;
    private int numWashoos = 5;

     Washoos(){
        setNamed ("Washoos");

    }

    public String getExtraInfo() {
        return "AutoWinStick: " + this.hasAutoWinStick + ", Number of Washoos: " + this.numWashoos;

    }
}
