package Player;

public class PlayerStatsmain {
    public static void main(String[] args) {
        FootballStats pratik = new FootballStats("Critiano Ronaldo", 900, 1000);
        CricketStats pratikss = new CricketStats("Ms Dhoni", 600, 25000);

        pratik.showFootballStats();
        pratikss.showCricketStats();
    }
}


