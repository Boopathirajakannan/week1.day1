package day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
			Print first number
			Iterate from 1 to the 11
			Add first and second number assign to sum
			Assign second number to the first number
			Assign sum to the second number
			Print sum
		 */
		int fstNum = 0, secNum = 1,sum = 0;
		System.out.println(fstNum);
		System.out.println(secNum);
		
		for (int i = sum ; i < 10; i++) {
			sum = fstNum + secNum;
		//Need to swap the last 2 numbers
			fstNum = secNum;
			secNum = sum;
		System.out.println(sum);
		
	}

	}
}
