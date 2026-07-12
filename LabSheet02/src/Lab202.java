import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int i  = 0; i < initial_numbers.length; i++) {
            numbers.add(initial_numbers[i]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        numbers.add(sc.nextInt());

        System.out.print("Enter numbers: ");
        numbers.add(8,sc.nextInt());

        numbers.remove(7);

        numbers.set(0, 10);

        System.out.println();
        System.out.println("Display all numbers : " + numbers);

        sc.close();
    }
}
