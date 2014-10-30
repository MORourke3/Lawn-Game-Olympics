import java.util.Random;

public class TeamManager {

    private Team[] team;

    // creates a new instance of olympian manager to be used
    OlympianManager A = new OlympianManager();

    public TeamManager()
    {
        // gets the array and cuts it in half for the number of teams
        this.team = new Team[(A.getLength()/2)];

        for (int i = 0; i < this.team.length; i++) {

            // randomly assigns each person of the array to one another
            Random rnd = new Random();
            int X = rnd.nextInt(16);
            int Y = rnd.nextInt(16);
            // Was not included, however, would have liked to include preventing the same person from being on multiple teams
            // need to include keeping track of individuals to prevent being on their own team, meaning the same person is printed on their own team twice

            this.team[i] = new Team(A.olympians[X], A.olympians[Y]);
        }
    }

    // returns the teams from above
    public Team[] getTeams(){
        return team;

    }
}

