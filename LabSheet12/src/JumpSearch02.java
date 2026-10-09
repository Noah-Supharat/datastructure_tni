import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class JumpSearch02 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();
        nums.sort((a, b) -> a.compareTo(b));

        for (int num : nums) {
            System.out.print(num + " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter a target number: ");
        int target = input.nextInt();

        int index = jumpSearch(nums, target);
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

    public static int jumpSearch(LinkedList<Integer> nums, int target) {
        int jump = (int)Math.floor(Math.sqrt(nums.size()));
        int start = 0;
        int m = 0;
        while (m < nums.size()) {
            if (nums.get(m) == target) {
                return m;
            } else if (nums.get(m) < target) {
                start = m;
                m += jump;
            } else {
                for (int i = start; i < m; i++) {
                    if(target == nums.get(i)) {
                        return i;
                    }
                }
                return -1;
            }
        }

        for (int i = start; i < nums.size(); i++) {
            if (target == nums.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
