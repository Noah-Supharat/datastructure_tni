
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayController arrayController = new ArrayController();
		arrayController.display("Display an initual dataset:");
		
		int[] new_nums = new int[arrayController.getSize() - 1];
		
		//copy data of the last part
		for (int i = 0; i < new_nums.length; i++) {
			new_nums[i] = arrayController.getNums()[i + 1];
		}
		
		//display result
		arrayController.setNums(new_nums);
		arrayController.display("\n\nAfter deleted the first index:");
	}

}
