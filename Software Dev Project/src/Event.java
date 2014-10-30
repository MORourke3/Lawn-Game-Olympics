
public abstract class Event {

    int playTo;
    boolean isPlayToExact;
    int playDistance;

    public abstract String getExtraInfo();


    public String name;
    public String eventName(){
        return name;
    }


    public void eventNamed(String name){
        this.name = name;
    }

    public String events;

    public Event(String events){
        this.events = events;
    }


    public Event(){

    }


}

