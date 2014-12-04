/**
 * Created by mjo95_000 on 10/29/2014.
 */
public class Ladderball extends Event{

    private int numRungs = 5;

    Ladderball(){
        setNamed ("LadderBall");
    }

    public String getExtraInfo() {
        return "Number of Rungs: " + this.numRungs;
    }
}
