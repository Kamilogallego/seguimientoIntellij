package encapsulation;

public class MainFutbol {
    public static void main (String[] args) {
        SoccerPlayer soccerPlayer = new Soccerplayer();
        soccerPlayer.setName("pablo");
        soccerPlayer.setGoalsScored(45);
        soccerPlayer.setJersyNumber(10);
        System.out.println(soccerPlayer.getName());

    }
}
