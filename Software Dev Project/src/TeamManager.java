import java.util.Random;

public class TeamManager {

    private Team[] team;

    public TeamManager(String args)
    {
        // teams manually assigned because random assignment was not able to work
        OlympianManager A = new OlympianManager(args);
        this.team = new Team[8];
        this.team[0] = new Team(A.olympians[0], A.olympians[8]);
        this.team[1] = new Team(A.olympians[1], A.olympians[9]);
        this.team[2] = new Team(A.olympians[2], A.olympians[10]);
        this.team[3] = new Team(A.olympians[3], A.olympians[11]);
        this.team[4] = new Team(A.olympians[4], A.olympians[12]);
        this.team[5] = new Team(A.olympians[5], A.olympians[13]);
        this.team[6] = new Team(A.olympians[6], A.olympians[14]);
        this.team[7] = new Team(A.olympians[7], A.olympians[15]);

    }

    // returns the teams from above
    public Team[] getTeams(){
        return team;

    }
}

