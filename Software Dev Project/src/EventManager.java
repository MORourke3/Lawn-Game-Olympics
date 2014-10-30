
public class EventManager {

    private Event[] event;

    public EventManager()
    {
        this.event = new Event[6];
        this.event[0] = new Washoos();
        this.event[1] = new CanJam();
        this.event[2] = new Horseshoes();
        this.event[3] = new Cornhole();
        this.event[4] = new Ladderball();
        this.event[5] = new Stickgame();

    }

    public Event[] getEvent(){
        return event;
    }
}




