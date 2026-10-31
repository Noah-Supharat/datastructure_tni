import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Play {
    String Username = "Kaolad";
    String Rank = "Beginner";
    int elo = 100;
    String gameResult;
    String opponent;
    Queue<String> beginnerQ = new ArrayDeque<>();
    Queue<String> IntermediateQ = new ArrayDeque<>();
    Queue<String> AdvantageQ = new ArrayDeque<>();

    public String getUsername() {
        return Username;
    }

    public String getRank() {
        return Rank;
    }

    public int getElo() {
        return elo;
    }

    public String getResult(){
        return gameResult;
    }

    public String getOpponent(){
        return opponent;
    }

    public void addOpponent(){
        beginnerQ.add("Beginner1");
        beginnerQ.add("Beginner2");
        beginnerQ.add("Beginner3");

        IntermediateQ.add("Intermediate1");
        IntermediateQ.add("Intermediate2");
        IntermediateQ.add("Intermediate3");

        AdvantageQ.add("Advantage1");
        AdvantageQ.add("Advantage2");
        AdvantageQ.add("Advantage3");
    }

    public String match(){
        String opponent;

        if (getRank().equals("Beginner")){
            opponent = beginnerQ.poll();
            beginnerQ.add(opponent);
            return opponent;
        } else if (getRank().equals("Intermediate")){
            opponent = IntermediateQ.poll();
            IntermediateQ.add(opponent);
            return opponent;
        } else {
            opponent = AdvantageQ.poll();
            AdvantageQ.add(opponent);
            return opponent;
        }
    }

    public void gamePlay(){
        gameResult = playResult();
        opponent = match();
        updateRank();
    }

    public void showPlay(){
        gamePlay();

        System.out.println("==========================");
        System.out.println("   Welcome to the game   ");
        System.out.println("==========================");
        System.out.println("Opponent: " + getOpponent());
        System.out.println();
        System.out.println("=== Game result: " + getResult() + " ===");

        if (getResult().equals("Win")){
            System.out.println("elo +25");
        } else if  (getResult().equals("Lose")){
            System.out.println("elo -25");
        }

        System.out.println();
        System.out.println("Current rank: " + getRank());
        System.out.println("Current elo: " + getElo());
    }

    public String playResult(){
        Random random = new Random();
        int result = random.nextInt(3) + 1;
        String gameResult;

        if(result == 1){
            gameResult = "Win";
            elo += 25;
        } else if(result == 2){
            gameResult = "Lose";
            elo -= 25;
        }  else{
            gameResult = "Draw";
        }
        return gameResult;
    }

    public void updateRank(){
        String rank;
        if(elo < 250){
            rank = "Beginner";
        } else if(elo < 500){
            rank = "Intermediate";
        }  else{
            rank = "Advanced";
        }
        Rank = rank;
    }

}
