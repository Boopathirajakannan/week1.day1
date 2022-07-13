package day1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 21;
		boolean prime = true;
		for (int j = 2; j < i; j++) {
			if (i % j == 0){
				System.out.println("This is Not Prime");
				prime = false;
				break;
			}
		}
			if(prime ==true)
			{System.out.println("This is Prime");
			}
			
		}
}


			
		
	


