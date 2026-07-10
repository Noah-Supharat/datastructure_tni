
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayController arrayController = new ArrayController();
		arrayController.display("Display an initual dataset:");
		
		int[] new_nums = new int[arrayController.getSize() - 1];
		
		int delete_index = 2;
		
		//copy data of the first part
		for (int i = 0; i < delete_index; i++) {
			new_nums[i] = arrayController.getNums()[i];
		}
		
		//copy data of the last part
		for (int i = delete_index + 1; i < arrayController.getSize(); i++) {
			new_nums[i - 1] = arrayController.getNums()[i];
		}
		
		//display result
		arrayController.setNums(new_nums);
		arrayController.display("\n\nAfter deleted index " + delete_index + ":");
	}

}
