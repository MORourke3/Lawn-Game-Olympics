
public abstract class Event {

    private int playTo;
    private boolean isPlayToExact;
    private int playDistance;

    public abstract String getExtraInfo();


    private String name;
    public String getName(){
        return name;
    }

    public void setNamed(String name){
        this.name = name;
    }

    public Event(){

    }


}

