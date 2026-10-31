import java.util.ArrayDeque;

public class History {
    ArrayDeque<String> history = new ArrayDeque<>();
    int matchCount = 1;
    Play play;

    public History(Play play) {
        this.play = play;
    }

    public void addHistory() {
        history.addFirst("Match : " + matchCount + " | 0pponent : " + play.getOpponent() + ", Result : " + play.getResult());
        matchCount++;

        if (history.size() > 5) {
            history.removeLast();
        }
    }

    public void showHistory() {
        System.out.println("==================");
        System.out.println("   PLAY HISTORY   ");
        System.out.println("==================");

        if (history.isEmpty()) {
            System.out.println("No history found");
        } else {
            for (String record : history) {
                System.out.println(record);
            }
        }
    }
}
