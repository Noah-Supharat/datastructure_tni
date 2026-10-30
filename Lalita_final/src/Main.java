import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("===========================================");
        System.out.println("   Online Game Matchmaking System (Demo)   ");
        System.out.println("===========================================");
        System.out.println("[1] Play"); //ในคิวจะมีคนรอคนเดียวต่อแรงค์ พอกดแล้วจะกลายเป็นห้องว่าง ว่างปุ๊บมันจะวนกลับมาใหม่
        System.out.println("[2] Profile"); //rank ก่อน elo
        System.out.println("[3] History"); //5 เกมล่าสุด
        System.out.println("[4] Exit");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        System.out.println();

        while(option != 4){
            if(option == 1){

            } else  if(option == 2){

            } else if(option == 3){

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