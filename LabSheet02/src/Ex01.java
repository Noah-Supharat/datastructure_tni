
public class Ex01 {

	public static void main(String[] args) {
		
		int[] nums = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("Length = " + nums.length);
		System.out.println("The first element = " + nums[0]);
		System.out.println("The last element = " + nums[nums.length-1]);
		System.out.println("The middle element = " + nums[nums.length/2]);
		
		System.out.print("Display all element = ");
		boolean first_element = true;
		for (int num : nums) {
			/* if (!first_element) {
				System.out.print(", ");
			}
			System.out.print(num);
			first_element = false; */
			
			System.out.print((!first_element ? ", " : "") + num);
			first_element = false; 
		}
	}

}
