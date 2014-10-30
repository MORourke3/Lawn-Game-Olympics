/**
 * Created by mjo95_000 on 10/29/2014.
 */
public class Cornhole extends Event{

    private int numBeanBags = 5;

    Cornhole(){
        eventNamed("Cornhole");
    }

    public String getExtraInfo() {
        return "Frisbee Size: " + this.numBeanBags;
    }
}
