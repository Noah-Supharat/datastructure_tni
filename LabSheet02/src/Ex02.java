import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[5];
		
	
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i <= 4; i++) {
			System.out.print("Enter number index " + i + ": ");
			nums[i] = scanner.nextInt();
		}
		
		System.out.println();
		ArrayController arrayController = new ArrayController();
		arrayController.setNums(nums);
		arrayController.display("Display all element:");

	}

}
