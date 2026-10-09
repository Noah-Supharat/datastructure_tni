import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch02 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();
        nums.sort((a, b) -> a.compareTo(b));

        for (int num : nums) {
            System.out.print(num + " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter a target number: ");
        int target = input.nextInt();

        int index = binarySearch(nums, target);
        if (index != -1) {
            System.out.println("\nThe target (" + target + ") at index " + index);
        } else {
            System.out.println("\nCannot found " + target + " in this array");
        }
    }

    public static LinkedList<Integer> random_initial(){
        LinkedList<Integer> nums = new LinkedList<Integer>();
        Random rnd = new Random();
        while (nums.size() < 10) {
            nums.add(rnd.nextInt(99));
        }
        return nums;
    }

    public static int binarySearch(LinkedList<Integer>  nums, int target) {
        int low = 0;
        int high = nums.size() - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (target == nums.get(middle)) {
                return middle;
            } else if (target < nums.get(middle)) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }
}
