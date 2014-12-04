
public class Competition implements ICompetition {

    //initializes the competition tracking variables
    public Competition next;
    public Competition prev;
    private Event event;
    private Team team1;
    private Team team2;
    public Team winningTeam;

    public Team getWinningTeam() {

        return this.winningTeam;

    }

    public void setWinningTeam(Team winningTeam){

        this.winningTeam = winningTeam;

    }

    public Event getevent(){

        return this.event;

    }

    public Team getteam1(){

        return this.team1;

    }

    public Team getteam2(){

        return this.team2;

    }

    public void setEvent(Event event){

        this.event = event;

    }

    public void setTeam1(Team team1){

        this.team1 = team1;

    }

    public void setTeam2(Team team2){

        this.team2 = team2;

    }

    public Competition(Event event, Team team1, Team team2){

        this.event = event;
        this.team1 = team1;
        this.team2 = team2;

    }

}
