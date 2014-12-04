/**
 * Created by mjo95_000 on 10/29/2014.
 */
public class Horseshoes extends Event{

    private int numHorseShoes = 5;

    Horseshoes(){
        setNamed("Horseshoes");
    }

    public String getExtraInfo() {
        return "Number of Horse Shoes: " + this.numHorseShoes;
    }
}

