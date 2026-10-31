public class Profile {
    Play play;

    public Profile(Play play) {
        this.play = play;
    }

    public void showProfile(){
        System.out.println("==================");
        System.out.println("   USER PROFILE   ");
        System.out.println("==================");
        System.out.println("Username: " + play.getUsername());
        System.out.println("Rank: " + play.getRank());
        System.out.println("Elo: " + play.getElo());
    }
}
