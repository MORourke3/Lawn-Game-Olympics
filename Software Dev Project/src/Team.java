
public class Team {

    // creates variables to be used
    public Olympian olympian1;
    public Olympian olympian2;

    private int wins;
    private int losses;

    private String name;

    public int getwins(){
        return wins;
    }

    public void setNamed(String name){
        this.name = name;
    }

    // assigns each team to a variable
    public Team(Olympian A, Olympian B)
    {
        this.olympian1 = A;
        this.olympian2 = B;
    }

}
