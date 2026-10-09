package Lab12;

import java.util.Scanner;

public class JumpSearch01 {

	public static void main(String[] args) {
		int[] nums = sorting(new int[] {96, 87, 18, 6, 31, 11, 56, 36, 76});
		
		for (int num : nums) {
			System.out.print(num + " ");
		}
		

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nEnter a target number: ");
		int target = input.nextInt();
		
		int index = jumpSearch(nums, target);
		if (index != -1) {
			System.out.println("\nThe target " + target + " at index " + index);
		} else {
			System.out.println("\nCannot found " + target + " in this array");
		}
	}
	
	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}

	public static int jumpSearch(int[] nums, int target) {
		int jump = (int)Math.floor(Math.sqrt(nums.length));
		int start = 0;
		int m = 0;
		while (m < nums.length) {
			if (nums[m] == target) {
				return m;
			} else if (nums[m] < target) {
				start = m;
				m += jump;
			} else {
				for (int i = start; i < m; i++) {
					if(target == nums[i]) {
						return i;
					}
				}
				return -1;
			}
		}
		
		for (int i = start; i < nums.length; i++) {
			if (target == nums[i]) {
				return i;
			}
		}
		return -1;
	}
}
