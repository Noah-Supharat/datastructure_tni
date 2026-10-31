import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("===========================================");
        System.out.println("   Online Game Matchmaking System (Demo)   ");
        System.out.println("===========================================");
        System.out.println("[1] Play");
        System.out.println("[2] Profile");
        System.out.println("[3] History");
        System.out.println("[4] Exit");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        System.out.println();

        Play play = new Play();
        Profile profile = new Profile(play);
        History history = new History(play);

        play.addOpponent();

        while(option != 4){
            if(option == 1){
                play.showPlay();
                history.addHistory();
                System.out.println();
            } else  if(option == 2){
                profile.showProfile();
                System.out.println();
            } else if(option == 3){
                history.showHistory();
                System.out.println();
            } else if(option == 4){
                break;
            } else {
                System.out.print("Wrong option, ");
            }
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            System.out.println();
        }

    }
}