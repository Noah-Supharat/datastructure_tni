import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch02 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();

        for (int num : nums) {
            System.out.print(num + " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter a target number: ");
        int target = input.nextInt();

        int index = linearSearch(nums, target);
        if (index != -1) {
            System.out.println("\nThe target (" + target + ") at index " + index);
        } else {
            System.out.println("\nCannot found " + target + " in this array");
        }
    }

    public static LinkedList<Integer> random_initial() {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        Random rnd = new Random();
        while (nums.size() < 10) {
            nums.add(rnd.nextInt(99));
        }
        return nums;
    }

    public static int linearSearch(LinkedList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            if (target == nums.get(i))
                return i;
        }
        return -1;
    }
}
