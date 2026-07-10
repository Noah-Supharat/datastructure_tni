
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayController arrayController = new ArrayController();
		arrayController.display("Display an initual dataset:");
		
		int[] new_nums = new int[arrayController.getSize() + 1];
		for (int i = 0; i < arrayController.getSize(); i++) {
			new_nums[i] = arrayController.getNums()[i];
		}
		
		arrayController.setNums(new_nums);
		arrayController.display("\n\nAfter add size:");
		
		arrayController.getNums()[arrayController.getSize() - 1] = 15;
		arrayController.display("\n\nAfter adding new_element:");
	}

}
