public class Club {
    private String name;
    private int wins;
    private int draws;
    private int losses;

    public Club() {
        name = "";
        wins = 0;
        draws = 0;
        losses = 0;
    }

    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getDraws() {
        return this.draws;
    }

    public int getLosses() {
        return this.losses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int numMatchesPlayed() {
        return this.wins + this.draws + this.losses;
    }

    public Boolean isFinish () {
        return this.numMatchesPlayed() < 10;
    }

    public int getPoints() {
        return this.wins*3 + this.draws*1;
    }

    public String toString() {
        return name + " club: " + wins + "/" + draws + "/" + losses + " - " + getPoints();
    }
}
